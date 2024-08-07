import java.util.Scanner;
public class Task1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input num: ");
		int num=sc.nextInt();
		
		if(num>0){
			System.out.println("Number is positive");
		}else if(num==0){
			System.out.println("Number is zero");
		}else{
			System.out.println("Number is negative");
		}
	}
}