package MediaManager;

public class Video extends Media {
    private int fps;

    public Video(String fileName, String fileType, int duration, String quality, int fps) {
        super(fileName, fileType, duration, quality);
        this.fps = fps;
    }

    public int getFps() {
        return fps;
    }

    public void setFps(int fps) {
        this.fps = fps;
    }

    @Override
    public String toString() {
        return "Video{" +
                "fps=" + fps +
                '}';
    }
}
