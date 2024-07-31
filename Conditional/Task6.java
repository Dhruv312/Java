import java.util.Scanner;
public class Task6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input floating-point number: ");
		float num1=sc.nextFloat();
		System.out.println("Input floating-point another number: ");
		float num2=sc.nextFloat();
		if(num1==num2){
			System.out.println("They are same num.");
		}else{
			System.out.println("They are different num.");
		}
		
	}
}