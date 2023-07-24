package proxy;

public class DatabaseImpl implements IDatabase {

    private final String databaseName;

    public DatabaseImpl(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public String getDatabaseName() {
        return databaseName;
    }
}
