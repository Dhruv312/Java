import java.util.Scanner;
public class Task19{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input Decimal num: ");
		int num=sc.nextInt();
		int rem;
		String str="";
		while(num!=0){
			rem=num%2;
			str+=rem;
			num=num/2;
		}
		System.out.println("Binary num: "+str);
	}
}