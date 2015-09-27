package br.com.admatic.utils.string;

public class PalindromeStringBuilderReverse extends Palindrome {
	public boolean validate(String sentence) {
		String normalizedSentence = cleanSentence(sentence);

		return normalizedSentence.equals(new StringBuilder().append(normalizedSentence).reverse().toString());
	}
}
