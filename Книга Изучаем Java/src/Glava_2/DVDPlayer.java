package Glava_2;

public class DVDPlayer {
    boolean canRecord = false;
    void playDVD () {
        System.out.println("Двд проигрывается");
    }
    void recordDVD () {
        System.out.println("Двд записывается");
    }
}
class DvdPlayerTestDrive {
    public static void main(String[] args) {
        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;
        d.playDVD();
        if (d.canRecord == true) {
            d.recordDVD();
        }

    }
}
