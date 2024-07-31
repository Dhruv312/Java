// Scenario 1: University Course Registration
// In a university course registration system, have classes like "Course," "Lecture," and "Lab" representing different types of courses. Use the instanceof operator to determine the type of course and perform specific registration operations based on the course type.

class Course{
    protected String courseName;

    public Course(String courseName){
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void register(){
        System.out.println("Registring for the course: "+courseName);
    }
}

class Lecture extends Course{

    public Lecture(String courseName){
        super(courseName);
    }

    public void register(){
        System.out.println("Registring for the Lecture: "+courseName);
    }
}

class Lab extends Course{

    public Lab(String courseName){
        super(courseName);
    }

    public void register(){
        System.out.println("Registring for the Lab: "+courseName);
    }
}


public class Task1 {
    public static void main(String[] args){
        Course course = new Course("General Course");
        Course lecture = new Lecture("Maths Lectue");
        Course lab = new Lab("Physics Lab");

        if (course instanceof Course) {
            System.out.println("This is General course.");
        }if(lecture instanceof Lecture){
            System.out.println("This is a Maths Lecture course.");
        }if(lab instanceof Lab){
            System.out.println("This is a Physics Lab course.");
        }

    }
}
