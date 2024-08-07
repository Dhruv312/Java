// Scenario 6: Music Player Application
// Develop an abstract class called "MediaPlayer" with abstract methods like "play" and "stop." Implement derived classes like "AudioPlayer" and "VideoPlayer" that provide specific implementations for these abstract methods.

abstract class MediaPlayer{
    abstract void play();

    abstract void stop();
}

class AudioPlayer extends MediaPlayer{

    @Override
    public void play(){
        System.out.println("Playing audio...");
    }

    @Override
    public void stop(){
        System.out.println("Stoping audio...");
    }
}

class VideoPlayer extends MediaPlayer {

    @Override
    public void play(){
        System.out.println("Playing audio...");
    }

    @Override
    public void stop(){
        System.out.println("Stoping audio...");
    }
}

public class Task6 {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        VideoPlayer videoPlayer = new VideoPlayer();

        audioPlayer.play();
        audioPlayer.stop();
    }
}
