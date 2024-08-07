import java.util.Scanner;
public class Task16{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in); 
		System.out.println("Input number of terms is: ");
		int num=sc.nextInt();
		int sum=0,count=0;
		int i=1;
		while(i<=num*2){
			if(i%2!=0){
				System.out.println(i);
				sum+=i;
			}
			i++;
		}
		System.out.println("The Sum of odd Natural Number upto 5 terms is: "+sum);
	}
}