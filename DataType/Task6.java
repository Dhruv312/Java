import java.util.Scanner;
public class Task5{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Input weigth in pounds: ");
		int w=sc.nextInt();
		System.out.println("Input height in inches: ");
		int h=sc.nextInt();
		
		double BMI;
		BMI=(w*0.453592)/(h*0.0254*h*0.0254);
		System.out.println("The BMI: "+BMI);
	}
}