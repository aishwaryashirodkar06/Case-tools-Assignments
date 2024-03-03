package journal;

public class factorial {
	
	    public static void main(String[] args) {
	        int number = 5; // You can change this to any positive integer
	        long factorial = calculateFactorial(number);
	        System.out.println("Factorial of " + number + " = " + factorial);
	    }

	    public static long calculateFactorial(int n) {
	        if (n == 0 || n == 1) {
	            return 1;
	        } else {
	            return n * calculateFactorial(n - 1);
	        }
	    }
	}



