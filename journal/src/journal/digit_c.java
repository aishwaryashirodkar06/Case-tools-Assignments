package journal;

public class digit_c {
	  int num;
	  int count = 0;
	  public digit_c (int num) {
	        this.num= num;
	        countDigits();
}
	  
	public void countDigits() {
	        
	        while (num != 0) {
	            num /= 10;
	            ++count;
	        }
	        System.out.println("Number of digits: " + count);
	    }
	public int getCount() {
        return count;
    }
	
	
}
