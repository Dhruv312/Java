// 2. Text Processing:
//    Create a search engine algorithm that reads and analyzes a text file, enabling users to input a word or phrase to find all occurrences and their respective positions within the document.
// - Input Text: "Java is a popular programming language. Java is used for various applications."
// - Search Query: "Java"
// - Expected Output: Positions found at [0, 32]

import java.util.Scanner;

public class Task2 {

    public static int[] searchWord(String text , String query){
        int []positions = new int[100];
        int count = 0;
        int index = text.indexOf(query);

        while (index >=0) {
            positions[count]= index;
            count++;
            index = text.indexOf(query,index+1);
        }
        int result[] =new int[count];
        for (int i = 0; i < count; i++) {
            result[i]=positions[i];
        }

        return result;

    }
    public static void main(String[] args) {
        String text = "Java is a popular programming language. Java is used for various applications.";
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Serch Query: ");
        String query = sc.nextLine();

        int positions[] = searchWord(text ,query);

        for (int i = 0; i < positions.length; i++) {
            System.out.println(positions[i]);
        }

    }
}
