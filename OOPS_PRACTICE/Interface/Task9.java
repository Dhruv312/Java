// Scenario 9: Online Music Streaming
// Create an interface called "MusicPlayer" with methods like "playSong" and "stopSong." Implement classes like "SpotifyPlayer" and "AppleMusicPlayer" that provide specific implementations for these interface methods.

interface MusicPlayer{
    void playSong(String title);
    void stopSong();
}

class SpotifyPlayer implements MusicPlayer {

    @Override
    public void playSong(String title) {
        System.out.println("Playing song on Spotify: " + title);
    }

    @Override
    public void stopSong() {
        System.out.println("Stopping song on Spotify.");
    }
}

class AppleMusicPlayer implements MusicPlayer {

    @Override
    public void playSong(String title) {
        System.out.println("Playing song on Apple Music: " + title);
    }

    @Override
    public void stopSong() {
        System.out.println("Stopping song on Apple Music.");
    }
}

public class Task9 {
    public static void main(String[] args) {
        MusicPlayer spotify = new SpotifyPlayer();
        MusicPlayer appleMusic = new AppleMusicPlayer();
        
        spotify.playSong("Spotify Player");
        spotify.stopSong();

        // Play and stop songs on Apple Music
        appleMusic.playSong("AppleMusic Player");
        appleMusic.stopSong();
    }
}
