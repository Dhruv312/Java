// 5. String Concatenation:
//    Write a class `Concatenator` with overloaded methods `concatenate()` to concatenate two strings, three strings, and four strings.
class Concatenation{
    public void concatenate(String str1,String str2){
        System.out.println("Concatenation two string: "+(str1+str2));
    }

    public void concatenate(String str1,String str2,String str3){
        System.out.println("Concatenation two string: "+(str1+str2+str3));
    }
    public void concatenate(String str1,String str2,String str3,String str4){
        System.out.println("Concatenation two string: "+(str1+str2+str3+str4));
    }
}
public class Task6 {
    public static void main(String[] args){
        Concatenation c1=new Concatenation();
        c1.concatenate("Royal ", "Technosoft");
        c1.concatenate("Royal ", "Technosoft ","pvt");
        c1.concatenate("Royal ", "Technosoft ","pvt ","ltd");
    }
}
