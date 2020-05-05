package MediaManager;

public class Main {

    public static void main(String[] args) {
        Ui ui = new Ui();
        AllFiles medialist = new AllFiles();
        ui.manageMedia(medialist);
    }
}
