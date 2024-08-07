public class Task22{
	public static void main(String[] args){
		int arr[]={1,2,4,5,6};
		int num=6;
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(num==(arr[i]+arr[j])){
					System.out.println("pair element is "+arr[i]+" and "+arr[j]+" sum is equal to a specified number "+num);
				}
			}
		}
	}
}