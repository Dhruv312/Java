public class Task11{
	public static void main(String[] args){
		int arr[]={78,54,67,89,34};
		int tamp;
		System.out.print("\nRverse after arrary: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr.length/2;i++){
			tamp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=tamp;
		}
		
		System.out.print("\nRverse after arrary: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}