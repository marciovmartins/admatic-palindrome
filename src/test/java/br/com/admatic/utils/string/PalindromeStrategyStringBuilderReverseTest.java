package br.com.admatic.utils.string;

public class PalindromeStrategyStringBuilderReverseTest extends PalindromeTest {

	public PalindromeStrategyStringBuilderReverseTest(String testName) {
		super(testName);
	}

	@Override
	public Palindrome palindrome() {
		return new PalindromeStringBuilderReverse();
	}

}
