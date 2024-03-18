package nontestcases;
import java.util.Scanner;
public class arm {
public static void main(String[] args) {
Scanner scan =new Scanner(System.in);
System.out.println("Enter a number");
System.out.println("Aishwarya Shirodkar RBCA22113");
int num=scan.nextInt();
int originalNumber, remainder, result = 0;
originalNumber = num;
while (originalNumber != 0)
{
remainder = originalNumber % 10;
result =result+(remainder*remainder*remainder);
originalNumber /= 10;
}
if(result == num)
System.out.println(num + " is an Armstrong number.");
else
System.out.println(num + " is not an Armstrong number.");
}
}