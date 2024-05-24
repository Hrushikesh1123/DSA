package lld;

import java.io.IOException;

public class ConsoleLogger implements LoggerInterface {

    @Override
    public void logInfo(String message) throws IOException {
       System.out.println("info"+message);
    }

    @Override
    public void logWarn(String message) throws IOException {
        System.out.println("warn"+message);
    }

    @Override
    public void logError(String message) throws IOException {
        System.out.println("error"+message);
    }
}
