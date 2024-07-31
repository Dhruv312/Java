import java.util.Scanner;
public class Task12{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		
		long u1=sc.nextLong();
		long u2=sc.nextLong();
		
		if(s1>s2){
			System.out.println(s1+" is greater than "+s2);
		}else if(s1<s2){
			System.out.println(s1+" is less than "+s2);
		}else{
			System.out.println(s1+" is equl to "+s2);
		}
		
		if(s1>s2){
			System.out.println(s1+" is greater than "+s2);
		}else if(s1<s2){
			System.out.println(s1+" is less than "+s2);
		}else{
			System.out.println(s1+" is equl to "+s2);
		}
	}
}