package lld;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements LoggerInterface,LogFileCloseInterface {
    private static FileLogger fileLogger=null;
    private static FileWriter file =null;

    FileLogger() throws IOException {
        file= new FileWriter("logger.txt");
    }
    private static synchronized FileLogger getLogger() throws IOException {
        if(fileLogger==null){
            fileLogger=new FileLogger();
        }
        return fileLogger;
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
