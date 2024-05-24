package lld;

import java.io.IOException;

public abstract class LoggerAbstract {
    protected LoggerInterface loggerInterface;

    protected LogFileCloseInterface logFileCloseInterface;

    public void close() throws IOException {
        logFileCloseInterface.close();
    }

}
