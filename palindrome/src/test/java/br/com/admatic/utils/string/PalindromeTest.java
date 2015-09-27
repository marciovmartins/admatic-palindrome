package br.com.admatic.utils.string;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class PalindromeTest extends TestCase {
	public PalindromeTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(PalindromeTest.class);
	}

	public void testIsPalindromeWithOneWord() {
		assertTrue(Palindrome.validate("ovo"));
		assertTrue(Palindrome.validate("omissíssimo"));
		assertTrue(Palindrome.validate("somávamos"));
	}
	
	public void testIsNotPalindromeWithOneWord() {
		assertFalse(Palindrome.validate("admatic"));
		assertFalse(Palindrome.validate("marcio"));
	}
}
