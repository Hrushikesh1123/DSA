package lld;

import java.io.IOException;

public interface LoggerInterface {
    void logInfo(String message) throws IOException;
    void logWarn(String message) throws IOException;
    void logError(String message) throws IOException;
}
