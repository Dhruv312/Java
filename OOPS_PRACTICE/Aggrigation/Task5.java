// Scenario 6: Music Playlist Creation
// Develop a music playlist system where a playlist consists of multiple songs. The playlist class contains a list of song objects, representing an aggregation relationship.

class Song {
    private String name;
    private String title;

    public Song(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}

class Playlist {
    private Song song[];
    private int counter;

    public Playlist(int capacity){
        this.counter=0;
        this.song=new Song[capacity];
    }

    public void addSong(Song song1) {
        if (counter < song.length) {
            song[counter] = song1;
            counter++;
        } else {
            System.out.println("can not add more Song");
        }
    }

    public void removeSong(String title) {
        for (int i = 0; i < counter; i++) {
            if (song[i].getTitle() == title) {
                for (int j = i; j < counter - 1; j++) {
                    song[j] = song[j + 1];
                }
                counter--;
            }
        }
    }

    public Song findSong(String title) {
        for (int i = 0; i < counter; i++) {
            if (song[i].getTitle() == title) {
                System.out.println("Name: " + song[i].getName() + ", Title: " + song[i].getTitle());
                return song[i];
            }
        }
        return null;
    }

    public void updateSong(String title,String name) {
        Song songUpdate = findSong(title);
        if (songUpdate != null) {
            songUpdate.setName(name);      
        }
    }

    public void displayInfo(){
        for (int i = 0; i < counter; i++) {
            System.out.println("Name: " + song[i].getName() + ", Title: " + song[i].getTitle());
        }
    }
}

public class Task5 {
    public static void main(String[] args) {
        Playlist playlist = new Playlist(10);
        playlist.addSong(new Song("Shreya Goshal","Teri ore"));
        playlist.addSong(new Song("Arjit Singh","Agar Tum Sath Ho"));
        playlist.addSong(new Song("Atif Aslam","Tere Sang Yaara"));
        playlist.addSong(new Song("Kishor Kumar","Nile Nile Ambar pe"));
        
        playlist.displayInfo();

        playlist.updateSong("Tere Sang Yaara","fjkdklkldskdslk");
        playlist.displayInfo();

    }
}
