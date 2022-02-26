package mediaAdapter;

public class Main {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new FormatAdapter(new VLC());
        mediaPlayer.play("file.mp3");
        mediaPlayer.play("file.mp4");
        mediaPlayer.play("file.vlc");
    }
}