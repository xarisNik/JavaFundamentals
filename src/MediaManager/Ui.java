package MediaManager;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Ui {

    public Choice menu() {
        Choice returnChoice;
        System.out.println("\n1.add a media file  2.remove a media file  3.display all media files  4.exit   5.save   6.stats");

        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        try{
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                return Choice.ADD;
            case 2:
                return Choice.REMOVE;
            case 3:
                return Choice.DISPLAY;
            case 4:
                return Choice.EXIT;
            case 5:
                return Choice.SAVE;
            case 6:
                return Choice.STATS;
            default:
                return Choice.ERROR;
           }
        }
        catch (Exception e) {
            return Choice.ERROR;
        }

    }

    public void manageMedia(AllFiles mediaList){
        Choice choice;
        try{
            mediaList.loadMediaList("media.txt");
            }
        catch (Exception e){
            System.out.println("no previous file found");
        }

        do {
            choice = menu();

            switch(choice) {
                case ADD:
                    Media media = createMedia();
                    mediaList.addMedia(media);
                    break;
                case REMOVE:
                    System.out.println("give an index to remove");
                    Scanner scanner = new Scanner(System.in);
                    int index = scanner.nextInt();
                    mediaList.removeMedia(index);
                    break;
                case DISPLAY:
                    mediaList.displayMedia();
                    break;
                case EXIT:
                   break;
                case ERROR:
                    System.out.println("you gave erroneous input");
                    break;
                case SAVE:
                    mediaList.saveMediaList("media.txt");
                    break;
                case STATS:
                    mediaList.statsForMedia();
                    break;

            }
        }while ((choice != Choice.EXIT));

    }

    public Media createMedia(){
        String fileName;
        String fileType;
        int duration;
        String quality;
        int type;
        String album;
        int fps;

        Scanner scanner = new Scanner(System.in);
        System.out.println("1.for audio file   2. for video file");
        type = scanner.nextInt();

        System.out.println("give file name");
        fileName = scanner.next();
        System.out.println("give file type");
        fileType = scanner.next();
        System.out.println("give duration of file");
        duration = scanner.nextInt();
        System.out.println("give file quality");
        quality = scanner.next();

        Media media;
        switch (type){
            case 1:
                System.out.println("give me album");
                album = scanner.next();
                media = new Audio(fileName, fileType, duration, quality, album);
                return media;
            case 2:
                System.out.println("give me fps");
                fps = scanner.nextInt();
                media = new Video(fileName, fileType, duration, quality, fps);
                return media;
            default:
                return null;

        }



       // Media media = new Media(fileName, fileType, duration, quality);


    }




}



