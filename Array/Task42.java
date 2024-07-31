public class Task42{
	public static void main(String[] args){
		int arr[]={0,1,0,1,0,0,1,1,0};
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int tamp=arr[i];
					arr[i]=arr[j];
					arr[j]=tamp;
				}
			}
		}
		System.out.println("Array after sagament is:");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
	}
}