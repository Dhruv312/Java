//2. Create a program that prompts the user to enter their age, and then determine if they are eligible for voting (age >= 18).

import java.util.Scanner;
public class  Task2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age: ");
		int age=sc.nextInt();
		System.out.println("Your age is: "+age);
		if(age>=18){
			System.out.println("you are eligible for voting");
		}else{
			System.out.println("you are not eligible for voting");
		}
	}
}