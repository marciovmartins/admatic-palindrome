package br.com.admatic.utils.string;

import junit.framework.TestCase;

public abstract class PalindromeTest extends TestCase {
	public PalindromeTest(String testName) {
		super(testName);
	}

	public abstract Palindrome palindrome();

	public void testIsPalindromeWithOneWord() {
		assertTrue(palindrome().validate("ovo"));
		assertTrue(palindrome().validate("omissíssimo"));
		assertTrue(palindrome().validate("somávamos"));
		assertTrue(palindrome().validate("Mussum"));
	}

	public void testIsNotPalindromeWithOneWord() {
		assertFalse(palindrome().validate("admatic"));
		assertFalse(palindrome().validate("marcio"));
	}

	public void testIsPalindromeWithSentences() {
		assertTrue(palindrome().validate("a caca"));
		assertTrue(palindrome().validate("a caça"));
		assertTrue(palindrome().validate("ato idiota"));
	}

	public void testIsPalindromeWithPunctuation() {
		assertTrue(palindrome().validate("A mil... Baita...Katia B. Lima"));
		assertTrue(palindrome().validate("Anita, a tina!"));
	}
}
