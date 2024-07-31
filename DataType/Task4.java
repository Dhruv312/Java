import java.util.Scanner;
public class Task4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input minutes: ");
		double min=sc.nextDouble();
		
		int year = (int)(min / 525600);
		int day= (int)(min/1440);
		System.out.println(min+"minut approximately "+year+" year and "+day+" day.");
	}
}