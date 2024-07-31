// Scenario 1: Student Grades
// In a school grading system, create an array to store the grades of students in a class. Perform operations such as calculating the average grade, finding the highest and lowest grades, and identifying students who scored above a certain threshold.


public class Task1 {
    public static void main(String[] args){
        double grade[] = {83.99,99.9,78.7,67.3,98.8};
        double max = grade[0];
        double min = grade[0];
        double average=0.0,sum=0.0;
        for (int i = 0; i < grade.length; i++) {
            sum+=grade[i];
        }
        average=sum/grade.length;

        for (int i = 1; i < grade.length; i++) {
            if (max<grade[i]) {
                max=grade[i];
            }

            if (min>grade[i]) {
                min=grade[i];
            }
        }
        
        System.out.println("Calculating the average grade: "+average);
        System.out.println("finding the highest grade: "+max);
        System.out.println("finding the lowest grade: "+min);
        System.out.print("This Students scored above a 50: {");
        for (int i = 0; i < grade.length; i++) {
            if(50<=grade[i]){
                System.out.print(grade[i]+",");
            }
        }
        System.out.print("\b}");
    
    }
}
