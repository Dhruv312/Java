import java.util.Scanner;
public class Task33{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Input the num: ");
		int num1=sc.nextInt();
		
		int sum=0,rem;
		sc.close();
		
		while(num1!=0){
			rem=num1%10;
			sum+=rem;
			num1=num1/10;
		}
		
		System.out.println("Sum of num: "+sum);
	}
}