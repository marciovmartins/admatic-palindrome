package br.com.admatic.utils.string;

public final class PalindromeFactory {

	public static Palindrome createService(int type) {
		switch (type) {
		case 1:
			return new PalindromeStrategy1();
		case 2:
			return new PalindromeStrategy2();
		}
		throw new IllegalArgumentException();
	}

}
