import java.util.Scanner;
public class Task13{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input number of terms : ");
		int num=sc.nextInt();
		int i=1;
		while(i<=num){
			System.out.println("Number is : "+i+" and cube of "+i+ " is : "+Math.pow(i,3));
			i++;
		}
	}
}