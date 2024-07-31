// 3. Hierarchical Inheritance Problem:
//    - Problem Statement: Implement a hierarchical inheritance setup with a base class 'Person' and two derived classes 'Student' and 'Teacher'. The 'Person' class should have attributes 'name' and 'age', and a method 'introduce()'. The 'Student' class should add an attribute 'grade', while the 'Teacher' class should add 'subject'. Both derived classes should override 'introduce()' to include their specific details. Utilize constructors and the 'super' keyword appropriately.

class Person{
    protected String name;
    protected int age;

    public Person(String name,int age){
        this.name =name;
        this.age=age;
    }

    public void introduce(){
        System.out.println("My name is "+name+" and ,I am "+age+" yeat old");
    }
}

class Student extends Person{
    protected char grade;

    public Student(String name, int age,char grade){
        super(name, age);
        this.grade=grade;
    }
    public void introduce(){
        System.out.println("My name is "+name+", I am "+age+" year old , and I am in grade "+grade);
    }
}

class Teacher extends Person{
    private String subject;

    public Teacher(String name, int age,String subject){
        super(name, age);
        this.subject=subject;
    }

    public void introduce(){
        System.out.println("My name is "+name+", I am "+age+" year old , and I teach "+subject);
    }
}

public class Task3 {
    public static void main(String[] args) {
        Student s1= new Student("Himesh", 18, 'A');
        Teacher t1=new Teacher("Mr. Meet",22,"Java");
        t1.introduce();
        s1.introduce();
    }
}
