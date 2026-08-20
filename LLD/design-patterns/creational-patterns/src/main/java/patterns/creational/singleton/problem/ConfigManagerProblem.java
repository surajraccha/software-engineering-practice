package patterns.creational.singleton.problem;

import java.util.HashMap;
import java.util.Map;

public class ConfigManagerProblem {
    private final Map<String, String> settings = new HashMap<>();

    public ConfigManagerProblem() {
        settings.put("app.name", "Practice App");
        settings.put("environment", "local");
    }

    public void set(String key, String value) {
        settings.put(key, value);
    }

    public String get(String key) {
        return settings.get(key);
    }

    public String identity() {
        return "ConfigManager@" + Integer.toHexString(System.identityHashCode(this));
    }
}
