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

    public String getFileType() {
        return fileType;
    }

    public int getDuration() {
        return duration;
    }

    public String getQuality() {
        return quality;
    }

    //setter
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public void setDuration(int duration) {
        this.duration = duration;
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