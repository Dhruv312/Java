import java.util.Scanner;
public class Task20{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input decimal num: ");
		int num2 = sc.nextInt();
		int rem,num;
		String hex="";
		while(num2!=0){
			rem=num2%16;
			hex=rem+hex;
			num2=num2/16;
		}
		num=Integer.parseInt(hex);
		if(num==10){
			System.out.println("Hexadecimal num is: A");
		}else if(num==11){
			System.out.println("Hexadecimal num is: B");
		}else if(num==12){
			System.out.println("Hexadecimal num is: C");
		}else if(num==13){
			System.out.println("Hexadecimal num is: D");
		}else if(num==14){
			System.out.println("Hexadecimal num is: E");
		}else if(num==15){
			System.out.println("Hexadecimal num is: F");
		}else{
			System.out.println("Hexadecimal num is: "+num);
		}
	}
}