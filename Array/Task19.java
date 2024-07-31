import java.util.Scanner;
public class Task19{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row: ");
		int r=sc.nextInt();
		System.out.println("Enter the col: ");
		int c=sc.nextInt();
		int arr1[][]=new int[r][c];
		int arr2[][]=new int[r][c];
		int arr3[][]=new int[r][c];
		System.out.println("first array: ");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("second array: ");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				arr2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				arr3[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		System.out.println("Array sum after: ");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
	}
}