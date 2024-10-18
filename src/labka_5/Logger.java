package labka_5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;

public class Logger {
    private static Logger instance;
    private static Object lock = new Object();
    private LogLevel currentLogLevel = LogLevel.INFO;
    private String logFilePath = "log.txt";


    private Logger() {}


    public static Logger getInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }


    public void log(String message, LogLevel level) {
        if (level.ordinal() >= currentLogLevel.ordinal()) {
            synchronized (this) { // Блокируем доступ к записи в файл
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFilePath, true))) {
                    writer.write(LocalDateTime.now() + " [" + level + "] " + message);
                    writer.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public void setLogLevel(LogLevel level) {
        this.currentLogLevel = level;
    }


    public void setLogFilePath(String path) {
        this.logFilePath = path;
    }

    public void readLogs() {
        try {
            Files.lines(Paths.get(logFilePath))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
 }
}
}

