import java.util.Scanner;
public class Task1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a degree in Fahrenheit: ");
		double f=sc.nextInt();
		
		double d=0;
		d=(f-32)*(9/5);
		System.out.println(f+"degree fehrenheit  is equle "+d+" in Celsius");
	}
}