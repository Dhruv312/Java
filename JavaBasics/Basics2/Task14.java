
public class Task14{
	public static void main(String[] args){
		for(int i=0;i<=5;i++){
			for(int j=0;j<=5;j++){
				if(i%2==0){
					if(i<5){
					System.out.print(" *");
					}
				}else{
					System.out.print("* ");
				}
			}
			System.out.print("\n");
		}
	}
}