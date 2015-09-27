package br.com.admatic.utils.string;

public class PalindromeBuiltInFor extends Palindrome {
	public boolean validate(String sentence) {
		String normalizedSentence = cleanSentence(sentence);

		int length = normalizedSentence.length();
		int middle = length / 2;
		for (int index = 0; index < middle; ++index) {
			if (normalizedSentence.charAt(index) != normalizedSentence.charAt(length - 1 - index)) {
				return false;
			}
		}

		return true;
	}
}
