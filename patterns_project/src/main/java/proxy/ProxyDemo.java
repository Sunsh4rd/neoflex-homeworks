package proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        new DatabaseProxy(new DatabaseImpl("some_db")).connect();
    }
}
