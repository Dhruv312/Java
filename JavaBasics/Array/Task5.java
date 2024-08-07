import java.util.Scanner;

public class Task5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num=sc.nextInt();
		boolean flag=false;
		int arr[]={1,2,3,4,5};
			
		for(int i=0;i<arr.length;i++){
			if(num==arr[i]){
				flag=true;
			}
		}
		if(flag==true){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
	}
}
