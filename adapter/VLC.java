package mediaAdapter;

public class VLC implements MediaPackage {
    @Override
    public void playFile(String filename) {
        System.out.println("playing " + filename);
    }
}