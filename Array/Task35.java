public class Task35{
	public static void main(String[] args){
		int arr[]={1,2,3,4,5,6};
		int tar=6;
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(tar==(arr[i]+arr[j])){
					System.out.println("Element sum to 6: "+arr[i]+" and "+arr[j]);
					break;
				}
			}
		}
	}
}