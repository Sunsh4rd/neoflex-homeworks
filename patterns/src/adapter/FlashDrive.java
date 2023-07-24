package adapter;

public class FlashDrive implements IUSB {
    @Override
    public void readData() {
        System.out.println("Reading data from a flash drive");
    }
}
