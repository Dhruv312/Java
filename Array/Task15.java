public class Task15{
	public static void main(String[] args){
		String arr1[]={"jeel","yash","Ram"};
		String arr2[]={"mohak","jeel","vishwa"};
		
		System.out.print("\nArray1: ");
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
			
		}
		
		System.out.print("\nArray2: ");
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+" ");
		}
		
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					System.out.println("\ncomman element is: "+arr1[i]);
				}
			}
		}
	}
}