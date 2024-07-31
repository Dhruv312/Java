public class Task30{
	public static void main(String[] args){
		int arr[]={22,11,10,0,-11};
		boolean flag=true;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0||arr[i]==-1){
				flag=false;
				break;
			}
		}
		
		System.out.println("Result: "+flag);
	}
}