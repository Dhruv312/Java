
// --> Problem Statement 2: Student Grades Aggregation

// Context:
// You are developing a system for a school to manage students' grades. Each student can be enrolled in multiple courses, and each course has multiple grades recorded for the student. Your task is to write a Java program that aggregates the grades data to provide insights such as total grades, average grade, and highest grade for each student.

// Requirements:
// 1. Create a `Course` class that contains a list of `Grade` objects. Each `Grade` object should have attributes such as `date` (of type `LocalDate`) and `score` (of type `double`).
// 2. Write methods in the `Course` class to:
//    - Calculate the total grades for the course.
//    - Calculate the average grade for the course.
//    - Find the highest grade for the course.
// 3. Create a `Student` class that contains a list of `Course` objects.
// 4. Write methods in the `Student` class to:
//    - Calculate the total grades for the student across all courses.
//    - Calculate the average grade for the student across all courses.
//    - Find the course with the highest average grade.

// Example Usage: 
import java.time.LocalDate;

class Grade {
    private LocalDate date;
    private double grade;

    public Grade(LocalDate date, double grade) {
        this.date = date;
        this.grade = grade;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getGrade() {
        return grade;
    }
}

class Course {
    private Grade grade[];
    private int gradeCount;
    private int capacity;

    public Course() {
        gradeCount = 0;
        capacity = 10;
        grade = new Grade[capacity];
    }

    public void addGrade(Grade grade1) {
        if (gradeCount < capacity) {
            grade[gradeCount] = grade1;
            gradeCount++;
        } else {
            System.out.println("can not add more student grade.");
        }
    }

    public double getTotalGrade() {
        double totalGrade = 0.0;
        for (int i = 0; i < gradeCount; i++) {
            totalGrade += grade[i].getGrade();
        }
        return totalGrade;
    }

    public double getAverageGrade() {
        return (getTotalGrade()/gradeCount);
    }

    public double getHighestGrade() {
        double highestGrade = grade[0].getGrade();
        for (int i = 1; i < grade.length; i++) {
            if (grade[i].getGrade() > highestGrade) {
                highestGrade = grade[i].getGrade();
            }
        }
        return highestGrade;
    }

}

class Student {
    private Course course[];
    private int capacity;
    private int courseCount;

    public Student() {
        capacity = 10;
        courseCount = 0;
        course = new Course[capacity];
    }

    public void addCourse(Course course1) {
        if (courseCount < capacity) {
            course[courseCount] = course1;
            courseCount++;
        } else {
            System.out.println("can not add more course");
        }
    }

    public double getTotalGrades() {
        double totalGrade = 0;
        for (int i = 0; i < courseCount; i++) {
            totalGrade += course[i].getTotalGrade();
        }
        return totalGrade;
    }

    public double getAverageGradeCourse() {
        if (courseCount == 0) {
            return 0.0;
        }
        return (getTotalGrades()/courseCount);
    }

    public double HighestGrade() {
        double highestGrade = course[0].getAverageGrade();
        for (int i = 1; i < courseCount; i++) {
            if (course[i].getAverageGrade() > highestGrade) {
                highestGrade = course[i].getAverageGrade();
            }
        }
        return highestGrade;
    }
}

public class Task2 {
    public static void main(String[] args) {
        Course math = new Course();
        math.addGrade(new Grade(LocalDate.of(2023, 1, 1), 95.0));
        math.addGrade(new Grade(LocalDate.of(2023, 1, 2), 85.0));

        Course science = new Course();
        science.addGrade(new Grade(LocalDate.of(2023, 1, 1), 95.0));
        science.addGrade(new Grade(LocalDate.of(2023, 1, 2), 80.0));

        Student student = new Student();
        student.addCourse(math);
        student.addCourse(science);

        System.out.println("Total grades for the student: " + student.getTotalGrades());
        System.out.println("Average grade for the student: " + student.getAverageGradeCourse());
        System.out.println("Course with the highest average grade: " + student.HighestGrade());
        System.out.println("Math students Total Grade: " + math.getTotalGrade());
        System.out.println("Science students Total Grade: " + science.getTotalGrade());

    }
}
