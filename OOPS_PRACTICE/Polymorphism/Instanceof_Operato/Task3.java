// Scenario 1: Online Course Platform
// In an online course platform, create classes like "Course," "VideoLesson," and "Quiz" representing different course components. Use the instanceof operator to determine the type of course component and perform specific actions or display relevant information.

class Course{
    protected String title;

    public Course(String title){
        this.title = title;
    }

    public String gettitle() {
        return title;
    }

    public void display(){
        System.out.println("Course components: "+title);
    }
}

class VideoLesson extends Course{
    private int duration;

    public VideoLesson(String title,int duration){
        super(title);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void display(){
        System.out.println("Video Lesson: "+gettitle()+" ("+getDuration()+"minutes)");
    }
}

class Quiz extends Course{
    private int numberOfQuestions;

    public Quiz(String title , int numberOfQuestions){
        super(title);
        this.numberOfQuestions = numberOfQuestions;
    }

    public int getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public void display(){
        System.out.println("Quiz: "+title+" ("+numberOfQuestions+" questions)");
    }
}


public class Task3 {
    public static void main(String[] args){
        Course course = new Course("Intoduction Progrmming");
        Course videolesson = new VideoLesson("Java Basics", 45);
        Course quiz = new Quiz("Java Quiz", 10);

        if (course instanceof Course) {
            course.display();
        }if(videolesson instanceof VideoLesson){
            videolesson.display();
        }if(quiz instanceof Quiz){
           quiz.display();
        }
    }
}
