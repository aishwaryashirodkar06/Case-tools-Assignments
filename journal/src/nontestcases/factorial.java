package nontestcases;

public class factorial {
	
	    public static void main(String[] args) {
	    	System.out.println("Aishwarya Shirodkar RBCA22113");
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



