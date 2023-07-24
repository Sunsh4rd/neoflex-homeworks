package singleton;

import java.time.LocalDate;

public class SingletonLogger {
    private static SingletonLogger instance;

    private SingletonLogger() {}

    public static SingletonLogger getInstance() {
        if (instance == null) {
            instance = new SingletonLogger();
        }
        return instance;
    }

    public String classLog(Object obj, String info) {
        return String.format("Log info: %s - %s - %s", LocalDate.now(), obj.getClass(), info);
    }
}
