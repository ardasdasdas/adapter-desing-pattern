package tr.com.estu.logger;

public class OldLogger implements Logger {
    @Override
    public void logMessage(String msg) {
        System.out.println("Logging message: " + msg);
    }
}
