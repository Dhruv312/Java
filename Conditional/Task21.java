import java.util.Scanner;
public class Task21{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input num of  row: ");
		int row=sc.nextInt();
	
		for(int i=1;i<=((row-1)*2)+1;i++){
			for(int j=(row+1)-i;j>0;j--){
				System.out.print(" ");
			}
				for(int l=1;l<=2*i-1;l++){
					System.out.print("*");
				}
			System.out.println("");
		}
	}
}