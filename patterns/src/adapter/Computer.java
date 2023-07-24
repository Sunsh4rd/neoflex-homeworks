package adapter;

public class Computer {
    public void connect(IUSB usb) {
        System.out.println("Device connected");
        usb.readData();
    }
}
