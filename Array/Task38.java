public class Task38{
	public static void main(String[] args){
		int arr[]={8, 8, 6, 2, 6, 6, 2, 6, 6};
		
		for(int i=0;i<arr.length;i++){
			int count=1;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
			
			if(count>(arr.length/2)){
				System.out.println("Mejority element is: "+arr[i]);
				break;
			}
		}
	}
}