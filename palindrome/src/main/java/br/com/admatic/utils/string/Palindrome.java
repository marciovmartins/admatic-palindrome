package br.com.admatic.utils.string;

/**
 * Palindrome class
 */
public class Palindrome {
	public static boolean validate(String sentence) {
		int length = sentence.length();
		int middle = length / 2;
		for (int index = 0; index < middle; ++index) {
			if (sentence.charAt(index) != sentence.charAt(length - 1 - index)) {
				return false;
			}
		}

		return true;
	}
}
