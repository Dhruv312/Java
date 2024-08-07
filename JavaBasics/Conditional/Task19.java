public class Task19{
	public static void main(String[] args){
		int num=0;
		for(int i=1;i<=4;i++){
			for(int j=5-i;j>0;j--){
				System.out.print(" ");
			}
			for(int l=1;l<=i;l++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}