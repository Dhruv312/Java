import java.util.Scanner;
public class Task32{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Input first num: ");
		int num1=sc.nextInt();
		
		System.out.println("Input second num: ");
		int num2=sc.nextInt();
		
		sc.close();
		
		if(num1==num2){
			System.out.println(num1+" == "+num2);
		}if(num1!=num2){
			System.out.println(num1+" != "+num2);
		}if(num1>num2){
			System.out.println(num1+" > "+num2);
		}if(num1>=num2){
			System.out.println(num1+" >= "+num2);
		}if(num1<num2){
			System.out.println(num1+" < "+num2);
		}if(num1<=num2){}
		System.out.println(num1+" <= "+num2);
	}
}