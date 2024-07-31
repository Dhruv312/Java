import java.util.Scanner;
public class Task25{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Input num: ");
		int n=sc.nextInt();
		int a;
		for(int i=0;i<n;i++){
			for(int l=0;l<n-i;l++){
				System.out.print(" ");
			}
			a=i;
			for(int k=1;k<=i;k++){
				System.out.print(a);
				a--;
			}
			for(int j=0;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=n;i>0;i--){
			for(int l=0;l<n-i;l++){
				System.out.print(" ");
			}
			a=i;
			for(int k=1;k<=i;k++){
				System.out.print(a);
				a--;
			}
			for(int j=0;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}