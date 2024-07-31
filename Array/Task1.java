import java.util.Scanner;
public class Task1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int a[]=new int[5];
		for(int i=0;i<a.length;i++){
			System.out.print("Enter array ["+i+"]:");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+",");
			System.out.print("\b\b");
			sum+=a[i];
		}
		System.out.print("sum of arrary is: "+sum);
	}
}