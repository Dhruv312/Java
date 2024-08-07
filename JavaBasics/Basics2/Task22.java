import java.util.Scanner;

public class Task22{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the Binary num: ");
		String num=sc.nextInt();
		
		for(int i=0;i<num.length();i++){
			char bit=num.chaAt(num.length()-i-1)
			if(bit==1){
				decimal+=Math.pow(2,i);
			}
		}
		System.out.println("Decimal num: "+sum);
	}
}