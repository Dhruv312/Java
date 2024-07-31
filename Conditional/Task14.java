import java.util.Scanner;
public class Task14{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the number (Table to be calculated) : ");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++){
			System.out.println(n+" * "+i+" = "+(n*i));
		}
	}
}