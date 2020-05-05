package MediaManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AllFiles {

    private ArrayList<Media> mediaList = new ArrayList<>();

    public void addMedia (Media i){
        mediaList.add(i);
    }

    public void removeMedia (int i){
        if (i>=0 && i <= mediaList.size()){
            mediaList.remove(i);
        }
    }

    public void displayMedia(){
//        for (Media i : mediaList){
//            System.out.println((i));
//        }
        mediaList.forEach(System.out::println);
    }

    public void saveMediaList(String filename) {
        try{
            PrintWriter printWriter = new PrintWriter(new File(filename));
            for (Media i : mediaList){
                printWriter.println(i.getFileName()+","+i.getFileType()+","+i.getQuality()+","+i.getDuration());
            }
            printWriter.close();
            System.out.println("media saved to media.txt");
        } catch (FileNotFoundException e) {
            System.out.println("The file cannot be saved");
            }
    }

    public void loadMediaList(String filename) {
        mediaList.clear();
        try{
            Scanner scanner = new Scanner((new File(filename)));
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] words = line.split(",");
                Media i = new Media (words[0], words[1], Integer.parseInt(words[2]), words[3]);
                mediaList.add(i);

            }
        }catch (Exception e){
            //

        }

    }

    public void statsForMedia(){
        float averageDuration = 0;
        for (Media i: mediaList){
           averageDuration += i.getDuration();
        }
        averageDuration = averageDuration / mediaList.size();
        System.out.println("the average duration of the media files is "+ averageDuration);


    }
}
