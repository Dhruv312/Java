public class Task28{
	public static void main(String[] args){
		int arr[]={11,2,33,4,56,32};
		int max=arr[0],min=arr[0],dif=0;
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
			if(min>arr[i]){
				min=arr[i];
			}
		}
		dif=max-min;
		System.out.println("Difference between largest and smallesr element of array: "+dif);
	}
}