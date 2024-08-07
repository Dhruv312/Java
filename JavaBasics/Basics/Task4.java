//4. Develop a program that takes a user's birthdate as input and calculates their current age.

import java.util.Scanner;
public class Task4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Year: ");
		int Year=sc.nextInt();
		
		System.out.println("Enter the Date: ");
		int date=sc.nextInt();
		
		System.out.println("Enter the Month: ");
		int month=sc.nextInt();
		
		int year1=2024;
		year1=year1-Year;
		System.out.println("Your age is: "+year1);
	}
}