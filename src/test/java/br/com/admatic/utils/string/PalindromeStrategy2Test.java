package br.com.admatic.utils.string;

public class PalindromeStrategy2Test extends PalindromeTest {

	public PalindromeStrategy2Test(String testName) {
		super(testName);
	}

	@Override
	public Palindrome palindrome() {
		return new PalindromeStringBuilderReverse();
	}

}
