import java.util.Scanner;
public class Task23{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input row: ");
		int row=sc.nextInt();
		
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int l=(row+1)-i;l>0;l--){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}