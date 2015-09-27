package br.com.admatic.utils.string;

public class PalindromeStrategyBuiltInForTest extends PalindromeTest {

	public PalindromeStrategyBuiltInForTest(String testName) {
		super(testName);
	}

	@Override
	public Palindrome palindrome() {
		return new PalindromeBuiltInFor();
	}

}
