import java.util.Scanner;
public class Task16{
	public static void main(String[] args){
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the size: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the element: ");
		for(int i=0;i<size;i++){
			System.out.print("element "+i+": ");
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(arr[i]==arr[j]){
					for(int l=j;l<size-1;l++){
						arr[l]=arr[l+1];
					}
					size--;
				}
			}
		}
		System.out.print("array element: ");
		for(int i=0;i<size;i++){
			System.out.print(arr[i]+" ");
		}
	}
}