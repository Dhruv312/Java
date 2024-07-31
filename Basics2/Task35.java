import java.util.Scanner;
public class Task35{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the number of sides on the polygon: ");
		int s=sc.nextInt();
		
		System.out.println("Input the length of one of the sides: ");
		double n=sc.nextDouble();
		
		double area=0;
		sc.close();
		
		area=(n*s*s)/(4*Math.tan(Math.PI/n));
		System.out.println("The area is: "+area);
	}
}