package lld;

import java.io.IOException;

public class Logger extends LoggerAbstract {
    //lets use the factory pattern to switch between for the object creation
    Logger(LoggerInterface loggerType) throws IOException {
       this.loggerInterface=loggerType;
       this.logFileCloseInterface=new FileLogger();
    }

    public void logWarn(String message) throws IOException {
        loggerInterface.logWarn(message);
    }
    public void logInfo(String message) throws IOException {
      loggerInterface.logInfo(message);
    }
    public void logError(String message) throws IOException {
      loggerInterface.logError(message);
    }
}
