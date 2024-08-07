import java.util.Scanner;
public class Task16{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input number of rows : ");
		int row=sc.nextInt();
		
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}