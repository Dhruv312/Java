import java.util.Scanner;
public class Task27{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input num: ");
		int num=sc.nextInt();
		
		if(num==0){
			System.out.println("The num is zero.");
		}else if(num>0){
			System.out.println("The num is Positive.");
		}else{
			System.out.println("The num is negative.");
		}
		if (Math.abs(num) < 1) {
            System.out.println("small");
        }else if (Math.abs(num) > 1000000) {
            System.out.println("large");
        }
	}
}