public class Task50{
	public static void main(String[] args){
		String str1="",str2="",str3="";
		for(int i=1;i<=100;i++){
			if(i%3==0&&i%5==0){
				str1+=i+",";
			}else if(i%3==0){
				str2+=i+",";
			}else if(i%5==0){
				str3+=i+",";
			}
		}
		System.out.println("\nDivided BY 3: "+str2+"\nDivided BY 5: "+str3+"\nDivided By both 3 and 5: "+str1);
	}
}