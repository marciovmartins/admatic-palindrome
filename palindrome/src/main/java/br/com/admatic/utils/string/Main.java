package br.com.admatic.utils.string;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Main {

	private static final String FILE = "assets/words.txt";
	private static long begin;
	private static long end;

	public static void main(String[] args) {
		MongoClient mongoClient = new MongoClient();
		MongoCollection<Document> palindromes = mongoClient.getDatabase("test").getCollection("palindromes");
		palindromes.drop();

		begin = System.nanoTime();
		
		try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
			String line;
			while ((line = br.readLine()) != null) {
				palindromes.insertOne(
						new Document().append("_id", line).append("isPalindrome", PalindromeStrategy1.validate(line)));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		end = System.nanoTime();
		long elapsed = TimeUnit.MILLISECONDS.convert(end - begin, TimeUnit.NANOSECONDS);
		System.out.println("Time elapsed: " + elapsed + "ms" );

		mongoClient.close();
	}

}
