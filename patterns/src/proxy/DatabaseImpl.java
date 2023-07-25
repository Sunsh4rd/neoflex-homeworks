package proxy;

public class DatabaseImpl implements IDatabase {

    private final String databaseName;

    public DatabaseImpl(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    @Override
    public void connect() {
        System.out.println(databaseName);
    }
}
