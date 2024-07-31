import java.util.Scanner;

public class Task49{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input num: ");
		int num= sc.nextInt();
		
		if(num%2==0){
			System.out.println("1");
		}else{
			System.out.println("0");
		}
	}
}