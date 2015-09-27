package br.com.admatic.utils.string;

public class PalindromeStrategy2 extends Palindrome {
	public static boolean validate(String sentence) {
		String normalizedSentence = cleanSentence(sentence);

		return normalizedSentence.equals(new StringBuilder(normalizedSentence).reverse().toString());
	}
}
