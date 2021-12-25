package Lesson16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

public class LoggerRunner {

    public static void main(String[] args) throws InterruptedException, IOException {

        Logger newLogs = new Logger("Thread One", LogLevels.ERROR, true, false);
        newLogs.fileWrite("Logs map:\n");
        Logger log1 = new Logger("Thread One", LogLevels.ERROR, true, true);
        log1.start();
        Logger log2 = new Logger("Thread Two", LogLevels.WARN, true, true);
        log2.start();
        Logger log3 = new Logger("Thread Three", LogLevels.INFO, true, true);
        log3.start();
        Thread.sleep(6_0000);

        String pathToFile = Logger.getPathToFile();
        String path = Path.of(pathToFile).toAbsolutePath().toString();
        BufferedReader reader = new BufferedReader(new FileReader(path));
        while (reader.ready()) {
            String readLine = reader.readLine();
            System.out.println(readLine);
        }
    }
}
