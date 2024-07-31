import java.util.Scanner;
public class Task21{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input decimal num: ");
		int num=sc.nextInt();
		int rem;
		String oct="";
		while(num!=0){
			rem=num%8;
			oct=rem+oct;
			num=num/8;
		}
		System.out.println("Octal num is: "+oct);
	}
}