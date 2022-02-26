package mediaAdapter;

public class FormatAdapter implements MediaPlayer {
    private MediaPackage media;

    public FormatAdapter(MediaPackage m) {
        media = m;
    }

    @Override
    public void play(String filename) {
        if (filename.endsWith(".mp3")) {
            System.out.println("playing " + filename);
        } else {
            media.playFile(filename);
        }
    }
}