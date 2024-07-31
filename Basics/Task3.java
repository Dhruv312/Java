//3. Build a Java application to collect the user's contact information (name, email, and phone number) and display it back to them.
import java.util.Scanner;
public class Task3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name: ");
		String name=sc.next();
		System.out.println("Enter the  Email: ");
		String num=sc.next();
		System.out.println("Enter the Number: ");
		String email=sc.next();
		System.out.println("Name: "+name+"\nNumber: "+num+"\nEmail: "+email);
	}
}