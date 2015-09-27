package br.com.admatic.utils.string;

public final class PalindromeFactory {

	public enum Strategy {
		BUILTIN_FOR, STRING_BUILDER_REVERSE
	}

	public static Palindrome createService(Strategy type) {
		switch (type) {
		case BUILTIN_FOR:
			return new PalindromeBuiltInFor();
		case STRING_BUILDER_REVERSE:
			return new PalindromeStringBuilderReverse();
		}
		throw new IllegalArgumentException();
	}

}
