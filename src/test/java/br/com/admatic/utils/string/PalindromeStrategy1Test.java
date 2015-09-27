package br.com.admatic.utils.string;

public class PalindromeStrategy1Test extends PalindromeTest {

	public PalindromeStrategy1Test(String testName) {
		super(testName);
	}

	@Override
	public Palindrome palindrome() {
		return new PalindromeBuiltInFor();
	}

}
