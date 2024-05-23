package designPatterns;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger logger=null;
    private static FileWriter file =null;

    private Logger()  {
    }

    public static Logger getInstance() throws IOException {
        if(logger==null) {
            logger = new Logger();
            file=new FileWriter("/Users/hrushikesh/Desktop/logget.txt");

        }
            return logger;
    }

    public void logInfo(String message) throws IOException {
       file.write("info"+message);
    }

    public void logWarn(String message) throws IOException {
        file.write("warn"+message);
    }

    public void logError(String message) throws IOException {
        file.write("error"+message);
    }
}
