public class Task29{
	public static void main(String[] args){
		int arr[]={5,1,7,9,3,4};
		int max=arr[0],min=arr[0];
		int sum=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
			if(arr[i]<min){
				min=arr[i];
			}
			sum+=arr[i];
		}
		
		double ave=(sum-(max+min))/(double)(arr.length-2);
		System.out.println("compute the average value of an array is: "+ave);
	}
}