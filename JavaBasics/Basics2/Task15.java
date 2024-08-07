//15. Write a Java program to swap two variables.
public class Task15{
	public static void main(String[] args){
		int n1=10,n2=20;
		int tamp;
		System.out.println("swap before n1= "+n1+" n2="+n2);
		tamp=n1;
		n1=n2;
		n2=tamp;
		System.out.println("swap after n1= "+n1+" n2="+n2);
	}
}