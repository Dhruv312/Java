import java.util.Arrays;
public class Task23{
	public static void main(String[] args){
		int arr1[]={1,2,3,4};
		int arr2[]={1,2,3,4};
		
		boolean flag=Arrays.equals(arr1,arr2);
		
		if(flag==true){
			System.out.println("Two array are equal");
		}else{
			System.out.println("Two array not are equal");
		}
	}
}