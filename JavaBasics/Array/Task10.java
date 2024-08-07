public class Task10{
	public static void main(String[] args){
		int arr[]={22,34,67,7,23,29,38};
		int max=arr[0],min=arr[0];
		
		for(int i=1;i<arr.length;i++){
			if(max>arr[i]){
				max=arr[i];
			}
			if(min<arr[i]){
				min=arr[i];
			}
		}
		
		System.out.println("maximum: "+max+" minimum: "+min);
	}
}