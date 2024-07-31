public class Task8{
	public static void main(String[] args){
		int arr1[]={1,2,3,4,5,6,7,8};
		int arr2[]=new int[8];
		
		System.out.print("\nArray 1: ");
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
		}
		
		for(int i=0;i<arr1.length;i++){
			arr2[i]=arr1[i];
		}
		
		System.out.print("\nArray 2: ");
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+" ");
		}
	}
}