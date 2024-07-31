import java.util.Scanner;
public class Task26{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Input num: ");
		int n=sc.nextInt();
		int ch=65;
		int ch2=64;
		for(int i=0;i<n;i++){
			ch=65;
			for(int l=0;l<n-i;l++){
				System.out.print(" ");
			}
			for(int j=1;j<i;j++){
				System.out.print((char)ch);
				ch=ch+1;
			}
			ch2=ch2+i;
			for(int k=1;k<=i;k++){
				System.out.print((char)ch2);
				ch2--;
			}
			System.out.println();
		}
		
		for(int i=n;i>0;i--){
			ch=65;
			for(int l=0;l<n-i;l++){
				System.out.print(" ");
			}
			for(int j=1;j<i;j++){
				System.out.print((char)ch);
				ch=ch+1;
			}
			ch2=ch2+i;
			for(int k=1;k<=i;k++){
				System.out.print((char)ch2);
				ch2--;
			}
			System.out.println();
		}
	}
}