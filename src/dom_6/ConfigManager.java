package dom_6;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
    private static volatile ConfigManager instance;
    private static final Object lock = new Object();
    private Map<String, String> config;


    private ConfigManager() {
        config = new HashMap<>();
    }


    public static ConfigManager getInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new ConfigManager();
                }
            }
        }
        return instance;
    }


    public void loadConfig(Map<String, String> settings) {
        config.putAll(settings);
    }


    public String getSetting(String key) throws Exception {
        if (config.containsKey(key)) {
            return config.get(key);
        } else {
            throw new Exception("Setting '" + key + "' not found.");
        }
    }


    public void setSetting(String key, String value) {
        config.put(key, value);
    }


    public void saveToFile(String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Map.Entry<String, String> entry : config.entrySet()) {
                writer.write(entry.getKey() + "=" + entry.getValue());
                writer.newLine();
            }
        }
    }


    public void loadFromFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("=", 2);
                if (parts.length >= 2) {
                    String key = parts[0];
                    String value = parts[1];
                    config.put(key, value);
                }
            }
        }
    }
}
