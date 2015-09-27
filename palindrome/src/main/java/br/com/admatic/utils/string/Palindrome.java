package br.com.admatic.utils.string;

import java.text.Normalizer;

/**
 * Palindrome class
 */
public class Palindrome {
	public static boolean validate(String sentence) {
		String normalizedSentence = cleanSentence(sentence);

		int length = sentence.length();
		int middle = length / 2;
		for (int index = 0; index < middle; ++index) {
			if (normalizedSentence.charAt(index) != normalizedSentence.charAt(length - 1 - index)) {
				return false;
			}
		}

		return true;
	}

	private static String cleanSentence(String sentence) {
		String normalizedSentence = Normalizer.normalize(sentence, Normalizer.Form.NFD).replaceAll("\\p{M}", "");
		return normalizedSentence;
	}
}
