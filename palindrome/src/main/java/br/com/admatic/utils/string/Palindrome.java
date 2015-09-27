package br.com.admatic.utils.string;

import java.text.Normalizer;

public class Palindrome {

	protected static String cleanSentence(String sentence) {
		return Normalizer.normalize(sentence, Normalizer.Form.NFD)
				.replaceAll("[^\\w+]", "")
				.toLowerCase();
	}

}
