import java.util.Scanner;
public class Task9{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input first num: ");
		int num1=sc.nextInt();
		System.out.println("Input second num: ");
		int num2=sc.nextInt();
		
		System.out.println("Sum of two integers: "+(num1+num2));
		System.out.println("Defference of two integers: "+(num1-num2));
		System.out.println("Product of two integers: "+(num1*num2));
		System.out.println("Average of two integers: "+((num1+num2)/2));
		System.out.println("Max integers: "+(Math.max(num1,num2)));
		System.out.println("Min integers: "+(Math.min(num1,num2)));
	}
}