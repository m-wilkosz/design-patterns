package mediaAdapter;

public class MP4 implements MediaPackage {
    @Override
    public void playFile(String filename) {
        System.out.println("playing " + filename);
    }
}