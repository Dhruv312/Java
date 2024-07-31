public class Task38{
	public static void main(String[] args){
		String str="Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		int space=0,letter=0,num=0,other=0;
		
		for(int i=0;i<str.length();i++){
			if((str.charAt(i)>='A'&&str.charAt(i)<='Z')||(str.charAt(i)>='a'&&str.charAt(i)<='z')){
				letter++;
			}else if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
				num++;
			}else if(str.charAt(i)==' '){
				space++;
			}else{
				other++;
			}
		}
		
		System.out.println("Space: "+space+"\nLetter: "+letter+"\nNumber: "+num+"\nOther: "+other);
	}
}