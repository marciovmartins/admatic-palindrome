package br.com.admatic.utils.string;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Main {

	private static final String FILE = "assets/words.txt";

	public static void main(String[] args) {
		MongoClient mongoClient = new MongoClient();
		MongoDatabase db = mongoClient.getDatabase("test");
		MongoCollection<Document> palindromes = db.getCollection("palindromes");
		palindromes.drop();

		try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
			String line;
			while ((line = br.readLine()) != null) {
				palindromes.insertOne(
						new Document().append("_id", line).append("isPalindrome", Palindrome.validate(line)));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		mongoClient.close();
	}

}
