import java.util.Scanner;

public class Task23{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the Binary num: ");
		String num=sc.nextLine();
		
		int decimal=0;

		for(int i=0;i<num.length();i++){
			char bit=num.charAt(num.length()-1-i);
			if(bit=='1'){
				decimal+=Math.pow(2,i);
			}
		}
		
		String hex = "";
        String hexDigits= "0123456789ABCDEF";

        if (decimal == 0) {
            hex = "0";
        } else {
            while (decimal != 0) {
                int rem = decimal % 16;
                hex = hexDigits.charAt(rem) + hex;
                decimal /= 16;
            }
        }
		
		System.out.println("Hexadecimal num: "+hex);
	}
}
