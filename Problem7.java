import java.util.ArrayList;

public class Problem7 {
	//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
	//What is the 10 001st prime number?
	
	public Problem7() {
		
	}
	
	public static int calcPrime(int inp) {
	    ArrayList<Integer> primus = new ArrayList<Integer>();
	    primus.add(2);
	    primus.add(3);

	    int counter = 4;

	    while(primus.size() < inp) {
	        if(counter % 2 != 0 && counter%3 != 0) {
	            int countTemp = 4;
	            while(countTemp*countTemp <= counter) {
	                if(counter % countTemp == 0)
	                    break;
	                countTemp ++;
	            }
	            if(countTemp*countTemp > counter) {
	                primus.add(counter);
	            }
	        }
	        counter++;
	    }

	    return primus.get(inp-1);
	    }

	public static void main(String[] args) {
		System.out.println(calcPrime(10001));
	}

}
