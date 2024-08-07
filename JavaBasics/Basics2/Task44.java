import java.util.Scanner;
public class Task44{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input num: ");
		int n=sc.nextInt();
		
		String str=Integer.toString(n);
		String str1=str+str;
		String str2=str1+str;
		
		int nn=Integer.parseInt(str1);
		int nnn=Integer.parseInt(str2);
		
		System.out.println(n+"+"+nn+"+"+nnn);
	}
}