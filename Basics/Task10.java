//10. Implement a basic calculator program that accepts two numbers and an operator (+, -, *, /) as input, performs the corresponding operation, and displays the result.

import java.util.Scanner;
public class Task10{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first num: ");
		double num1=sc.nextDouble();
		
		System.out.println("Enter the second num: ");
		double num2=sc.nextDouble();
		
		int choice;
		System.out.println("\n1.+"+"\n2.-"+"\n3.*"+"\n4./"+"\nEnter the choice:");
		choice=sc.nextInt();
		switch(choice){
			case 1:
				System.out.println("The sun of two num is: "+(num1+num2));
				break;
			case 2:
				System.out.println("The Subtraction of two num is: "+(num1-num2));
				break;
			case 3:
				System.out.println("The Multiplication of two num is: "+(num1*num2));
				break;
			case 4:
				System.out.println("The Division of two num is: "+(num1/num2));
				break;
			default:
				System.out.println("Invelid choice");
		}
		
	}
}