// Scenario 9: Movie Streaming Service
// Develop a movie streaming service where a user can have multiple favorite movies. The user class contains a list of movie objects, representing an aggregation relationship.

import java.util.Scanner;

class Movie {
    private String title;
    private String genre;

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Genre: " + genre;
    }
}

class User {
    private String name;
    private Movie[] favoriteMovies;
    private int movieCount;

    public User(String name, int maxMovies) {
        this.name = name;
        this.favoriteMovies = new Movie[maxMovies];
        this.movieCount = 0;
    }

    public void addFavoriteMovie(Movie movie) {
        if (movieCount < favoriteMovies.length) {
            favoriteMovies[movieCount] = movie;
            movieCount++;
        } else {
            System.out.println("Cannot add more favorite movies.");
        }
    }

    public void removeFavoriteMovie(String title) {
        for (int i = 0; i < movieCount; i++) {
            if (favoriteMovies[i].getTitle().equals(title)) {
                for (int j = 0; j < movieCount - 1; j++) {
                    favoriteMovies[j] = favoriteMovies[j + 1];
                }
                favoriteMovies[--movieCount] = null;
                System.out.println("Deleted movie with title: " + title);
                return;
            }
        }
        System.out.println("Movie with title: " + title + " not found.");
    }

    public Movie findFavoriteMovie(String title) {
        for (int i = 0; i < movieCount; i++) {
            if (favoriteMovies[i].getTitle().equals(title)) {
                return favoriteMovies[i];
            }
        }
        return null;
    }

    public void updateDestination(String title) {
        for (int i = 0; i < movieCount; i++) {
            if (favoriteMovies[i].getTitle().equals(title)) {
                int choice;
                do {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("1------------>Title");
                    System.out.println("2------------>genre");
                    System.out.println("0------------>exit");
                    System.out.println("Enter your choice :- ");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.println("Enter the new Title:- ");
                            sc.nextLine();
                            String tit = sc.nextLine();
                            favoriteMovies[i].setTitle(tit);
                            break;
                        case 2:
                            System.out.println("Enter the new genre:- ");
                            sc.nextLine();
                            String con = sc.nextLine();
                            favoriteMovies[i].setGenre(con);
                            break;

                        case 0:
                            break;
                        default:
                            System.out.println("Invailid Choice!!!");
                            break;
                    }
                } while (choice != 0);
                System.out.println("The movie is updated succesfully.");

                return;
            }
        }
    }

    public void displayFavoriteMovies() {
        System.out.println(name + "'s Favorite Movies:");
        for (int i = 0; i < movieCount; i++) {
            System.out.println(favoriteMovies[i]);
        }

    }
}

public class Task9 {
    public static void main(String[] args) {
        User user = new User("Alice", 5);

        Movie movie1 = new Movie("Inception", "Sci-Fi");
        Movie movie2 = new Movie("The Godfather", "Crime");
        Movie movie3 = new Movie("The Dark Knight", "Action");

        user.addFavoriteMovie(movie1);
        user.addFavoriteMovie(movie2);
        user.addFavoriteMovie(movie3);

        user.displayFavoriteMovies();

        System.out.println("\nRemoving 'Inception' from favorites...");
        user.removeFavoriteMovie("Inception");
        user.displayFavoriteMovies();
    }
}
