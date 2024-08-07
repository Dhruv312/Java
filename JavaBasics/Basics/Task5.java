//5. Implement a program to accept the user's weight and height, and then calculate their BMI (Body Mass Index).
import java.util.Scanner;
public class Task5{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the weight: ");
		double weight= sc.nextDouble();
		
		System.out.println("Enter the height: ");
		double height= sc.nextDouble();
		
		double BMI;
		BMI=(weight/(height*height));
		
		System.out.println("BMI IS: "+BMI);
	}
}