public class Problem2 {
	// Each new term in the Fibonacci sequence is generated by adding the
	// previous two terms. By starting with 1 and 2, the first 10 terms will be:
	// 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
	// By considering the terms in the Fibonacci sequence whose values do not
	// exceed four million, find the sum of the even-valued terms.

	public Problem2() {

	}

	public static int fib(int n) {
		if (n < 2) {
			return n;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;

		while (fib(i) < 4000000) {
			if (fib(i) % 2 == 0) {
				sum = sum + fib(i);
			}
			i++;
		}

		System.out.println(sum);
	}
	
}
