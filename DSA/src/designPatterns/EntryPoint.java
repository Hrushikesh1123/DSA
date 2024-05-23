package designPatterns;

import java.io.IOException;

public class EntryPoint {

    public static void main(String[] args) throws IOException {
        Logger logger=Logger.getInstance();
        logger.logInfo("Hidd");
        logger.logError("hello");
        logger.logWarn("warn");
        logger.close();
        System.out.println("Executed successfully");
    }
}
