public class Task32{
	public static void main(String[] args){
		int arr[]={45,65,32,11,64,77,89};
		boolean flag1=false,flag2=false;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==65){
				flag1=true;
			}
			if(arr[i==77){
				flag2=true;
			}
		}
		
		if(flag1==flag2){
			System.out.println("The array contains both 65 and 77.");
		}else{
			System.out.println("The array does not contains both 65 and 77.");
		}
	}
}