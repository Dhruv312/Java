import  java.util.Scanner;
public class Task11{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input num: ");
		int num=sc.nextInt();
		int i=1,sum=0;
		while(i<=num){
			sum+=i;
			i++;
		}
		System.out.println("The Sum of Natural Number upto n terms : "+sum);
	}
}