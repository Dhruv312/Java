// 9. Array of Objects Initialization:
//    Develop a 'Movie' class with fields 'title', 'director', and 'releaseYear'. Write a main class where you create an array of 'Movie' objects, initializing each element of the array using a constructor, and then display their details.
class Movie{
    private String title;
    private String director;
    private int releaseYear;

    public Movie(String title,String director,int releaseYear){
        this.title=title;
        this.director=director;
        this.releaseYear=releaseYear;
    }

    void display(){
        System.out.println("Title: "+title);
        System.out.println("Director: "+director);
        System.out.println("Release Year: "+releaseYear);
    }

}
public class Task9 {
    public static void main(String[] args){

        Movie m1[]=new Movie[3];
        m1[0]=new  Movie("Race", "khilav  Patel", 2005);
        m1[1]=new  Movie("Race", "khilav  Patel", 2005);

        for (int i = 0; i < m1.length; i++) {
            m1[i].display();
        }
    }
}
