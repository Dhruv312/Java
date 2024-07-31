// Scenario 7: University Management System
// Create an abstract class called "Person" with abstract methods like "registerCourse" and "submitAssignment." Implement derived classes like "Student" and "Professor" that provide specific implementations for these abstract methods.

abstract class Person{
    protected  String name;


    public Person(String name ){
        this.name = name;
  
    }
    
    abstract void registerCourse(String course);
    abstract void submitAssigment(String assigment);
}

class Student extends Person{
    
    public Student(String name){
        super(name);      
    }

    public void registerCourse(String course){
        System.out.println(name+" (Student) has registered for the course: "+course);
    }

    public void submitAssigment(String assigment){
        System.out.println(name+" (Student) has submitted the assignment:"+assigment);
    }
}

class Professor extends Person{
    
    public Professor(String name){
        super(name);
    }

    public void registerCourse(String course){
        System.out.println(name+" (Professor) has registered for the course: "+course);
    }

    public void submitAssigment(String assigment){
        System.out.println(name+" (Professor) has submitted the assignment:"+ assigment);
    }
}
public class Task7 {
    public static void main(String[] args) {
        Student student = new Student("Himesh");
        student.registerCourse("computer science");
        student.submitAssigment("EGD");
        Professor professor = new Professor("Profe Ms");
        professor.registerCourse("IT");
        professor.submitAssigment("Infomation Technology");
    }
}
