public class Problem3 {
	// The prime factors of 13195 are 5, 7, 13 and 29.
	// What is the largest prime factor of the number 600851475143 ?

	public Problem3() {

	}

	public boolean isPrime(long n) {
		if (n % 2 == 0) {
			return false;
		}

		long half = (n / 2) % 2 == 0 ? (n / 2) - 1 : n / 2;

		for (int i = 3; i < half; i += 2) {
			if (n % i == 0)
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		Problem3 p = new Problem3();

		long t = 600851475143L;
		long d = 2;
		while (true) {
			long temp = 600851475143L / d;
			if (t % temp == 0 && p.isPrime(temp)) {
				System.out.println(temp);
				break;
			}
			d++;
		}
	}
}