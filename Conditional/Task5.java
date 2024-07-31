import java.util.Scanner;
public class Task5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input num: ");
		int choice=sc.nextInt();
		switch(choice){
			
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Thusday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Tursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
		}
	}
}