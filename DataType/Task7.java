import java.util.Scanner;
public class Task6{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Input distance in meter: ");
		double me=sc.nextDouble();
		
		System.out.println("Input hour: ");
		double h=sc.nextDouble();
		
		System.out.println("Input minutes: ");
		double m=sc.nextDouble();
		
		System.out.println("Input second: ");
		double s=sc.nextDouble();
		
		double se;
		se=(h*3600)+(m*60)+s;
		System.out.println("total s: "+se);
		double ms,mh,kh;
		
		ms=(double)(me/se);
		kh=(double)((me/1000)/(se/3600));
		mh=(double)((me/1609)/(se/3600));
		
		System.out.println("Your speed is meters/second is "+ms);
		System.out.println("Your speed is kh/h is "+kh);
		System.out.println("Your speed is miles/h is "+mh);
	}
}