package designPatterns;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger logger=null;
    private static FileWriter file =null;

    private Logger()  {
    }

    public static synchronized  Logger getInstance() throws IOException {
        if(logger==null) {
            logger = new Logger();
            file=new FileWriter("logget.txt");
        }
            return logger;
    }

    public void logInfo(String message) throws IOException {
       file.write("info"+message+ "\n");
    }

    public void logWarn(String message) throws IOException {
        file.write("warn"+message+ "\n");
    }

    public void logError(String message) throws IOException {
        file.write("error"+message + "\n");
    }

    public void close() throws IOException {
        file.close();
    }
}
