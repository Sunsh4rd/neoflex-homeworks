package adapter;

public class MemoryCardImpl implements IMemoryCard {
    @Override
    public void readData() {
        System.out.println("Reading data from a memory card");
    }
}
