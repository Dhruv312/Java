//3. Write a Java program to divide two numbers and print them on the screen.
//Test Data :
//50/3
//Expected Output :
//16
import java.util.Scanner;
public class Task3{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		System.out.println("The Division of two num: "+(num1/num2));
	}
}