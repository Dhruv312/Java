public class Task39{
	public static void main(String[] args){
		String str="1234";
		int count=0;
		
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				for(int k=0;k<4;k++){
					if(i!=j&&j!=k&&i!=k){
					System.out.println(str.charAt(i)+""+""+str.charAt(j)+""+str.charAt(k));
						count++;
					}
				}
			}
		}
		
		System.out.println("Count is: "+count);
	}
}