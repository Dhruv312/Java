public class Task13{
	public static void main(String[] args){
		String arr[]={"Ram","Himesh","patel","meet","Ram","meet"};
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					System.out.println("duplicate element is: "+arr[i]);
				}
			}
		}
	}
}