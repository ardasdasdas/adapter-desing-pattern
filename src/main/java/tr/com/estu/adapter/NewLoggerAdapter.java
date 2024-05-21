package tr.com.estu.adapter;

import tr.com.estu.logger.Logger;
import tr.com.estu.logger.NewLogger;

public class NewLoggerAdapter implements Logger {
    private final NewLogger newLogger;

    public NewLoggerAdapter(NewLogger newLogger) {
        this.newLogger = newLogger;
    }

    @Override
    public void logMessage(String msg) {
        newLogger.writeLog(msg);
    }
}
