import java.util.Scanner;
public class Task20{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input row: ");
		int row=sc.nextInt();
		int num=0;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				num=num+1;
				System.out.print(num);
			}
			System.out.println();
		}
	}
}