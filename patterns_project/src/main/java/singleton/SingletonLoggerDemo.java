package singleton;

public class SingletonLoggerDemo {
    public static void main(String[] args) {
        System.out.println(SingletonLogger.getInstance().classLog(
                new TestClass("This is test"), "Some info"
        ));

        System.out.println(SingletonLogger.getInstance().classLog(
                5, "Integer log"
        ));
    }
}
