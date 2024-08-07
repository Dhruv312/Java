import java.util.Scanner;
public class Task34{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the length of a side of the hexagon: ");
		int s=sc.nextInt();
		double sum=0;
		sc.close();
		sum=((6 * s*s)/(4*0.577));
		System.out.println("Input the length of a side of the hexagon: "+sum);
	}
}