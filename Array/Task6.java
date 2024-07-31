public class Task6{
	public static void main(String[] args){
		int num=88;
		int arr[]={12,45,67,49,88,20};
		boolean flag=false;
		
		for(int i=0;i<arr.length;i++){
			if(num==arr[i]){
				System.out.println("Index of position of "+num+" is: "+i );
				flag=true;
			}
		}
		if(flag==false){
			System.out.println("Not present the num.");
		}
	}
}