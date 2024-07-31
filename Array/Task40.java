public class Task40{
	public static void main(String[] args){
		int arr[]={1, 5, -5, 7, 8, -6};
		int a=0,b=0;
		int minsum=arr[0]+arr[1];
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				int sum=arr[i]+arr[j];
				if(Math.abs(minsum) > Math.abs(sum)){
					minsum=sum;
					a=arr[i];
					b=arr[j];
				}
			}
		}
		
		System.out.println("sum is close to zero: "+a+" and "+b);
	}
}