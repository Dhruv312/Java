public class Task43{
	public static void main(String[] args){
		int arr[]={10, 20, 30, 40, 1, 2};
		int tar=53;
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				for(int l=j+1;l<arr.length;l++){
					for(int k=l+1;k<arr.length;k++){
						if(tar==(arr[i]+arr[j]+arr[l]+arr[k])){
							System.out.println("Element sum to 53: "+arr[i]+","+arr[j]+","+arr[l]+","+arr[k]);
							break;
						}
					}
				}
			}
		}
	}
}