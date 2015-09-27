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
		assertTrue(PalindromeStrategy1.validate("ovo"));
		assertTrue(PalindromeStrategy1.validate("omissíssimo"));
		assertTrue(PalindromeStrategy1.validate("somávamos"));
		assertTrue(PalindromeStrategy1.validate("Mussum"));
	}
	
	public void testIsNotPalindromeWithOneWord() {
		assertFalse(PalindromeStrategy1.validate("admatic"));
		assertFalse(PalindromeStrategy1.validate("marcio"));
	}
	
	public void testIsPalindromeWithSentences() {
		assertTrue(PalindromeStrategy1.validate("a caca"));
		assertTrue(PalindromeStrategy1.validate("a caça"));
		assertTrue(PalindromeStrategy1.validate("ato idiota"));
	}
	
	public void testIsPalindromeWithPunctuation() {
		assertTrue(PalindromeStrategy1.validate("A mil... Baita...Katia B. Lima"));
		assertTrue(PalindromeStrategy1.validate("Anita, a tina!"));
	}
}
