package br.com.admatic.utils.string;

import java.text.Normalizer;

public abstract class Palindrome {

	/**
	 * Validate if is a palindrome or not.
	 * @param sentence
	 * @return
	 */
	public abstract boolean validate(String sentence);
	
	/**
	 * Remove spaces and punctuation.
	 * @param sentence
	 * @return
	 */
	protected static String cleanSentence(String sentence) {
		return Normalizer.normalize(sentence, Normalizer.Form.NFD)
				.replaceAll("[^\\w+]", "")
				.toLowerCase();
	}

}
