public class Problem4 {
	// A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
	// Find the largest palindrome made from the product of two 3-digit numbers.

	public Problem4() {

	}

	public static boolean isPalindrome(int number) {
		int palindrome = number;
		int reverse = 0;

		while (palindrome != 0) {
			int remainder = palindrome % 10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome / 10;
		}

		// if original and reverse of number is equal means
		// number is palindrome in Java
		if (number == reverse) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		for (int i = 999; i >= 900; i--) { // Upper and lower bounds
			for (int j = 999; j >= 900; j--) { // It's assumed there is a palindrome in these bounds
				if (isPalindrome(i * j)) {
					System.out.println(i + " * " + j + " = " + i * j);
				}
			}
		}
	}

}
