package tr.com.estu;

import tr.com.estu.adapter.NewLoggerAdapter;
import tr.com.estu.logger.Logger;
import tr.com.estu.logger.NewLogger;

public class Main {
    public static void main(String[] args) {
        NewLogger newLogger = new NewLogger();
        Logger adapter = new NewLoggerAdapter(newLogger);

        adapter.logMessage("This is a log message through the adapter.");
        adapter.logMessage("This is another log message through the adapter.");
    }
}