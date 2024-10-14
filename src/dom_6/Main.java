package dom_6;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ConfigManager config = ConfigManager.getInstance();

        Map<String, String> settings = new HashMap<>();
        settings.put("db_host", "localhost");
        settings.put("db_port", "5432");
        config.loadConfig(settings);


        try {
            System.out.println("Database Host: " + config.getSetting("db_host"));
            System.out.println("Database Port: " + config.getSetting("db_port"));
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            config.saveToFile("config.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            ConfigManager config2 = ConfigManager.getInstance();
            config2.loadFromFile("config.txt");
            System.out.println("Loaded from file: " + config2.getSetting("db_host"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

