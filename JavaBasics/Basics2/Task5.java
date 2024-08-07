 /*
 5. Write a Java program that takes two numbers as input and displays the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
*/
import java.util.Scanner;
public class Task5{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Input first number: ");
		int num1=sc.nextInt();
		
		System.out.println("Input first number: ");
		int num2=sc.nextInt();
		
		System.out.println(num1+"x"+num2+"="+num1*num2);
	}
}