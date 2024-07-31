//8. Develop a program to take the user's marks in three subjects (Math, Science, and English) and calculate their average score.

import java.util.Scanner;
public class Task8{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Math matks: ");
		double math=sc.nextDouble();
		
		System.out.println("Enter the Science marks: ");
		double science=sc.nextDouble();
		
		System.out.println("Enter the English marks: ");
		double english=sc.nextDouble();
		
		double Average;
		Average=(math+science+english)/3;
		System.out.println("The average of three subject  marks is : "+Average);
	}
}