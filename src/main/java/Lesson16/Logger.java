package Lesson16;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Logger extends Thread {

    LogLevels logLevel;
    private static String pathToFile = "src\\main\\java\\lesson16\\ThreadOut.txt";
    private boolean append;

    public Logger(String name, LogLevels logLevel, boolean deamon, boolean append) {
        super(name);
        this.logLevel = logLevel;
        setDaemon(deamon);
        this.append = append;
    }

    public static String getPathToFile() {
        return pathToFile;
    }

    public static void setPathToFile(String pathToFile) {
        Logger.pathToFile = pathToFile;
    }

    @Override
    public void run() {
        while (true) {
            try {
                print();
                Thread.sleep((long) (Math.random() * 5000));
            } catch (InterruptedException | IOException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }

    private void print() throws IOException {
        Date current = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        String message = "<" + formatter.format(current) + ">" +
                "<" + getState() + "><" + getName() + "><" +
                this.logLevel + "><" + this.logLevel.message + ">";
        fileWrite(message);
    }

    public void fileWrite(String text) throws IOException {
        String path = Path.of(pathToFile).toAbsolutePath().toString();
        FileWriter writeToFile = new FileWriter(path, append);
        PrintWriter print = new PrintWriter(writeToFile);
        print.printf("%s" + "%n", text);
        print.close();
    }
}

