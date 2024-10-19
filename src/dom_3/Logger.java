package dom_3;

public class Logger {
    public void log(String message, String level) {
        System.out.println(level + ": " + message);
    }

    public void logError(String message) {
        log(message, "ERROR");
    }

    public void logWarning(String message) {
        log(message, "WARNING");
    }

    public void logInfo(String message) {
        log(message, "INFO");
    }
}
