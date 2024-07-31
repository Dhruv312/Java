import java.util.Scanner;
public class Task7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input month: ");
		int mon=sc.nextInt();
		System.out.println("Input year: ");
		int year=sc.nextInt();
		
		switch(mon){
			case 1:
				System.out.println("January "+year+" has 31 days");
				break;
			case 2:
				if((year%4==0 && year%100!=0 ) ||  (year%400==0 && year%100==0)){
					System.out.println("February "+year+" has 29 days");
				}else{
					System.out.println("February "+year+" has 28 days");
				}
				break;
			case 3:
				System.out.println("March "+year+" has 31 days");
				break;
			case 4:
				System.out.println("Aplil "+year+" has 30 days");
				break;
			case 5:
				System.out.println("May "+year+" has 31 days");
				break;
			case 6:
				System.out.println("June "+year+" has 30 days");
				break;
			case 7:
				System.out.println("July "+year+" has 31 days");
				break;
			case 8:
				System.out.println("Augst "+year+" has 30 days");
				break;
			case 9:
				System.out.println("Septembet "+year+" has 31 days");
				break;
			case 10:
				System.out.println("Octomber "+year+" has 30 days");
				break;	
			case 11:
				System.out.println("December "+year+" has 31 days");
				break;
		}
		
	}
}