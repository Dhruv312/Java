// 1. Data Validation:
//    Design a Java program that validates and sanitizes user-provided email addresses, ensuring they adhere to standard email format rules (e.g., presence of '@' and '.' symbols, proper domain format).

public class Task1 {
    public static void main(String[] args){
        String email = "meet12.3@gmailcom";

        int index1 = email.indexOf('@');
        int index2 =email.lastIndexOf('.');  

        if(index1> 0 && index2 > index1+1 && index2 < email.length()-1){
            System.out.println(email+" is valid email.");
        }else{
            System.out.println(email+" is not valid email.");
        }
    }
}
