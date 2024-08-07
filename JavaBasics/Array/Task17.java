public class Task17{
	public static void main(String[] args){
		int arr[]={11,20,24,2,10,6};
		int max=arr[0],min=arr[0];
		int max1=0,min1=0;
		System.out.println("Array:");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]){
				max1=max;
				max=arr[i];
			}
			if(min>arr[i]){
				min1=min;
				min=arr[i];
			}
		}
		for(int i=1;i<arr.length;i++){
			if(max1<arr[i]&&arr[i]!=max){
				max1=arr[i];
			}
			if(min1>arr[i]&&arr[i]!=min){
				min1=arr[i];
			}
		}
		
		System.out.println("\nmax: "+max+" "+"min: "+min);
		System.out.println("max1: "+max1+" "+"min1: "+min1);
	}
}