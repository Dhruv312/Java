import java.util.Scanner;
public class Task9{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size=sc.nextInt();
		int arr[]=new int[size+1];
		int num=34,index=3;
		System.out.print("\nEnter the array element: ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
	
		for(int j=size;j>index;j--){
					arr[j]=arr[j-1];
		}
		size++;
		arr[index]=num;

		
		System.out.print("\nAdd after array: ");
		for(int i=0;i<size;i++){
			System.out.print(arr[i]+" ");
		}
	}
}