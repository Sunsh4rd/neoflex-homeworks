package proxy;

public class DatabaseProxy implements IDatabase {

    private final DatabaseImpl database;

    public DatabaseProxy(DatabaseImpl database) {
        this.database = database;
    }

    @Override
    public String getDatabaseName() {
        return "Connected to localhost:5432/" + database.getDatabaseName();
    }
}
