public class Task31{
	public static void main(String[] args){
		int arr[]={10,1,11,23,10,3,10};
		int num=10,sum1=30,sum2=0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==num){
				sum2+=arr[i];
			}
		}
		
		if(sum1<=sum2){
			System.out.println("Result: true");
		}else{
			System.out.println("Result: false");
		}
	}
}