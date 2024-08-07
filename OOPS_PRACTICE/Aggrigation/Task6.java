
// Scenario 7: Social Media User Connections
// Design a social media system where a user can have multiple connections or friends. The user class contains a list of user objects, representing an aggregation relationship.
import java.util.Scanner;

 class Course {
    private String courseName;
    private String courseCode;

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseCode='" + courseCode + '\'' +
                '}';
    }
}

class Student {
    private String name;
    private String studentId;
    private Course[] courses;
    private int courseCount;

    public Student(String name, String studentId, int maxCourses) {
        this.name = name;
        this.studentId = studentId;
        this.courses = new Course[maxCourses];
        this.courseCount = 0;
    }

    public void addCourse(Course course) {
        if (courseCount < courses.length) {
            courses[courseCount++] = course;
        } else {
            System.out.println("Cannot add: Maximum number of courses reached.");
        }
    }

    public void findCourse(String courseCode) {
        for (int i = 0; i < courseCount; i++) {
            if (courses[i].getCourseCode().equals(courseCode)) {
                System.out.println("Found: " + courses[i].getCourseName() + "," + courses[i].getCourseCode());
                return;
            }
        }
        System.out.println("Course with code " + courseCode + " not found.");
    }

    public void deleteCourse(String courseCode) {
        for (int i = 0; i < courseCount; i++) {
            if (courses[i].getCourseCode().equals(courseCode)) {

                for (int j = i; j < courseCount - 1; j++) {
                    courses[j] = courses[j + 1];
                }
                courses[--courseCount] = null;
                System.out.println("Deleted course with code " + courseCode);
                return;
            }
        }
        System.out.println("Course with code " + courseCode + " not found.");
    }

    public void updateCourse(String courseCode) {
        for (int i = 0; i < courseCount; i++) {
            if (courses[i].getCourseCode().equals(courseCode)) {
                int choice;
                do {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("1------------>courseName ");
                    System.out.println("2------------>courseCode ");
                    System.out.println("0------------>exit");
                    System.out.println("Enter your choice :- ");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.println("Enter the new courseName:- ");
                            sc.nextLine();
                            String name = sc.nextLine();
                            courses[i].setCourseName(name);
                            break;

                        case 2:
                            System.out.println("Enter the new courseCode :- ");
                            sc.nextLine();
                            String code = sc.nextLine();
                            courses[i].setCourseCode(code);
                            break;

                        case 0:
                            break;
                        default:
                            System.out.println("Invailid Choice!!!");
                            break;
                    }
                } while (choice != 0);
                System.out.println("The course is updated succesfully.");

                return;
            }
        }
    }

    public void displayCourses() {
        System.out.println("Courses for student " + name + ":");
        for (int i = 0; i < courseCount; i++) {
            System.out.println(courses[i].getCourseName() + " (" + courses[i].getCourseCode() + ")");
        }
    }

}

public class Task6 {
    public static void main(String[] args) {

        Course math101 = new Course("Mathematics 101", "M101");
        Course cs101 = new Course("Computer Science 101", "CS101");
        Course hist101 = new Course("History 101", "H101");

        Student student = new Student("Meet", "S12345", 5);

        student.addCourse(math101);
        student.addCourse(cs101);
        student.addCourse(hist101);

        student.findCourse("CS101");

        student.deleteCourse("H101");
        student.updateCourse("M101");
        student.displayCourses();
    }
}
