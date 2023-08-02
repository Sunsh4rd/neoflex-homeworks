package proxy;

public class DatabaseProxy implements IDatabase {

    private final DatabaseImpl database;

    public DatabaseProxy(DatabaseImpl database) {
        this.database = database;
    }

    @Override
    public void connect() {
        System.out.println("Connected to localhost:5432/" + database.getDatabaseName());
    }
}
