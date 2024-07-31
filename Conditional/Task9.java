import java.util.Scanner;
public class Task9{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the year: ");
		int year=sc.nextInt();
		
		if((year%4==0 && year%100!=0 ) ||  (year%400==0 && year%100==0)){
			System.out.println("leap year");
		}else{
			System.out.println("not leap year");
		}
	}
}
