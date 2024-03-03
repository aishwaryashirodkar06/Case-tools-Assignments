package journal;
import java.util.Scanner;
public class fibonacci {
	
	        int[] fibSeries;
		    fibonacci() {
		        fibSeries = new int[5];
		        fibSeries[0] = 0;
		        fibSeries[1] = 1;
		        for (int i = 2; i < fibSeries.length; i++) {
		            fibSeries[i] = fibSeries[i - 1] + fibSeries[i - 2];
		        }
		    }

		    public int[] getFibSeries() {
		        return fibSeries;
		    }

		    
		}


