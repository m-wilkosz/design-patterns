package mediaAdapter;

public class MP3 implements MediaPlayer {
    @Override
    public void play(String filename) {
        System.out.println("playing " + filename);
    }
}