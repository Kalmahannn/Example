package dom_3;

public class DatabaseConfig {
    public static final String CONNECTION_STRING = "Server=myServer;Database=myDb;User Id=myUser;Password=myPass;";
}

 class DatabaseService {
    public void connect() {
        String connectionString = DatabaseConfig.CONNECTION_STRING;
        // Логика подключения к базе данных
    }
}

class LoggingService {
    public void log(String message) {
        String connectionString = DatabaseConfig.CONNECTION_STRING;
        // Логика записи лога в базу данных
    }
}

