package lld;

import java.io.IOException;

public class Driver {
    public static void main(String[] args) throws IOException {
        Logger logger=new Logger(new ConsoleLogger());
        logger.logError("testng the framework");
        logger=new Logger(new FileLogger());
        logger.logWarn("testing");
        logger.logInfo("hey hey");
        logger.close();
    }
}
