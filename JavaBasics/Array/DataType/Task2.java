import java.util.Scanner;
public class Task2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the inch: ");
		double num=sc.nextDouble();
		double meter = num*0.0254;
		System.out.println(num+" inch is "+ meter+" meters");
	}
}