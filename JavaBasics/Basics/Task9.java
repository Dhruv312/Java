//9. Create a program that asks the user for their address, including street, city, state, and zip code, and displays the complete address.

import java.util.Scanner;
public class Task9{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Street: ");
		String street=sc.nextLine();
		
		System.out.println("Enter the City: ");
		String city=sc.nextLine();
		
		System.out.println("Enter the State: ");
		String state=sc.nextLine();
		
		System.out.println("Enter the Zip code: ");
		String code=sc.next();
		
		System.out.println("Address:");
		System.out.println("Street: "+street+"\nCity: "+city+"\nState: "+state+"\nZip code: "+code);
	}
}