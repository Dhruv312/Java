// 6. Create a simple password validation system that prompts the user to enter a password and checks if it meets certain criteria (e.g., minimum length, containing numbers and special characters).
import java.util.Scanner;
public class Task6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the password: ");
		String str=sc.next();
		
		int len=str.length();
		boolean flag=false;
		System.out.println(len);
		
		if(len>=8){
			
			for(int i=0;i<str.length();i++){
				if(str[i]='@'||str[i]='#'||str[i]='$'||str[i]='&'){
					flag =true;
				}
			}
			
			if(flag==true){
				System.out.println(flag);
			}else{
				System.out.println(flag);
			}
			
		}
		else{
			System.out.println(flag);
		}
	}
}