public class Task7{
	public static void main(String[] args){
		int arr[]={1,2,3,45,6,7};
		int num=3;
		
		System.out.print("remove before the array: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==num){
				for(int j=i;j<arr.length-1;j++){
					arr[j]=arr[j+1];
				}
			}
		}
		System.out.print("\nremove after the array: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}