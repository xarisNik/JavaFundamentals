package MediaManager;

public class Media {

    private String fileName;
    private String fileType;
    private int duration;
    private String quality;


    //constructor


    public Media(String fileName, String fileType, int duration, String quality) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.duration = duration;
        this.quality = quality;
    }



    //getter
    public String getFileName() {
        return fileName;
    }

    //setter
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    //toString
    @Override
    public String toString() {
        return "Media{" +
                "fileName='" + fileName + '\'' +
                ", fileType='" + fileType + '\'' +
                ", duration=" + duration +
                ", quality='" + quality + '\'' +
                '}';
    }
}