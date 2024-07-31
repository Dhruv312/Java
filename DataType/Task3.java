import java.util.Scanner;
public class Task3{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Input num between 0 to 1000: ");
		int num=sc.nextInt();
		sc.close();
		int sum=0;
		int num1=num;
		while(num!=0){
			int rem=num%10;
			sum+=rem;
			num=num/10;
		}
		System.out.println("The sum of all digit in "+num1+" is "+sum);
	}
}