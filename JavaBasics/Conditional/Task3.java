import java.util.Scanner;
public class Task3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the three num a,b and c");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int max=Math.max(a,b);
		int max1=Math.max(max,c);
		System.out.println(max1);
		
	}
}