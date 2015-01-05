public class Problem6 {
	// Find the difference between the sum of the squares of the first one
	// hundred natural numbers and the square of the sum.
	
	public Problem6() {

	}

	public static int differenceSumSquares(int input) {
		return squareSum(input) - sumSquares(input);
	}
	
	public static int sumSquares(int input) {
		int fitemebro = 0;
		for(int i = 1; i <= input; i++) {
			fitemebro += Math.pow(i, 2);
		}
		return fitemebro;
	}
	
	public static int squareSum(int input) {
		
		int srym8 = 0;
		for(int i = 1; i <= input; i++) {
			srym8 += i;
		}
		return (int) (Math.pow(srym8,2));
	}


	public static void main(String[] args) {
		System.out.println(differenceSumSquares(100));

	}

}
