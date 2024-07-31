import java.util.Scanner;
public class Task37{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Input String: ");
		String str=sc.nextLine();
		
		int len=str.length();
		sc.close();
		
		for(int i=len-1;i>=0;i--){
			System.out.print(str.charAt(i));
		}
	}
	