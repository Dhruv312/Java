import java.util.Scanner;
public class Task2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a,b and c: ");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		
		double root=(b*b)-(4*a*c);
		
		if(root>0){
			double root1=(-b+Math.sqrt(root))/2*a;
			double root2=(-b-Math.sqrt(root))/2*a;
			System.out.println("The roots are: "+root1+" and "+root2);
		}else if(root==0){
			double root3=-b/2*a;
			System.out.println("The roots are: "+root3);
		}
	}
}