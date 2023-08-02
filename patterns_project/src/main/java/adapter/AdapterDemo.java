package adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.connect(new FlashDrive());
        computer.connect(new MemoryCardAdapter(new MemoryCardImpl()));
    }
}
