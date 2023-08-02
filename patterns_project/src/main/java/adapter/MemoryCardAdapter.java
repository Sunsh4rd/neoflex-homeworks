package adapter;

public class MemoryCardAdapter implements IUSB {

    private final MemoryCardImpl memoryCard;

    public MemoryCardAdapter(MemoryCardImpl memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void readData() {
        memoryCard.readData();
    }
}
