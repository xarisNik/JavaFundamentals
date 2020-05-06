package MediaManager;

public class Audio extends Media {
    String album;

    public Audio(String fileName, String fileType, int duration, String quality, String album) {
        super(fileName, fileType, duration, quality);
        this.album = album;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "Audio{" +
                "album='" + album + '\'' +
                '}';

    }
}
