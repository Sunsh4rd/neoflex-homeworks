package proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        System.out.println(new DatabaseProxy(new DatabaseImpl("some_db")).getDatabaseName());
    }
}
