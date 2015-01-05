public class Problem5 {
	// 2520 is the smallest number that can be divided by each of the numbers
	// from 1 to 10 without any remainder.
	// What is the smallest positive number that is evenly divisible by all of
	// the numbers from 1 to 20?

	public Problem5() {

	}

	public static int GCD(int a,int b) {
	    if(b>a)
	    return GCD(b,a);
	    if(b==0)
	    return a;
	    return GCD(b,a%b);
	}
	
	public static int LCM(int a,int b) { //Euclidean Algorithm
		int k = GCD(a,b);
	    a/=k;
	    return a*b;
	}

	public static void main(String[] args) { //Crazy-ass code, I'd need to alter my code to be able to do more than 2 numbers at a time.
		System.out.println(LCM((LCM((LCM((LCM((LCM((LCM((LCM((LCM((LCM((LCM((LCM((LCM((LCM((LCM((LCM((LCM((LCM((LCM((LCM(1,2)),3)),4)),5)),6)),7)),8)),9)),10)),11)),12)),13)),14)),15)),16)),17)),18)),19)),20));
	}
}