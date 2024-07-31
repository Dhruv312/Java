// 4. Copy Constructor:
//    Create a 'Student' class with fields 'name', 'rollNumber', and 'grade'. Implement a copy constructor that initializes a new object as a copy of an existing 'Student' object. Also, provide a method to display the student's details.

class Student{
    private String name;
    private int rollNumber;
    private char grade;

    public Student(Student s1){
        this.name=s1.name;
        this.rollNumber=s1.rollNumber;
        this.grade=s1.grade;
    }
    public Student(String name,int rollNumber,char grade){
        this.name=name;
        this.rollNumber=rollNumber;
        this.grade=grade;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll no: "+rollNumber);
        System.out.println("Grade: "+grade);
    }
};
public class Task4 {
    public static void main(String[] args){
        Student s1=new Student("Meet",1,'A');
        Student s2=new Student(s1);
        s1.display();
        s2.display();
    }
}
