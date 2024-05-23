package designPatterns;

import java.io.IOException;

public class EntryPoint {

    public static void main(String[] args) throws IOException {
        Logger logger=Logger.getInstance();
        logger.logInfo("Hi");
        logger.logError("hello");
        logger.logWarn("warn");
        System.out.println("Executed successfully");
        Logger logger1=Logger.getInstance();
        if(logger.equals(logger1)){
            System.out.println("Both share the same address");
        }
    }
}
