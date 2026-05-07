public class ConfigManager {
    private static ConfigManager instance;
    private ConfigManager() {}

    public static ConfigManager getInstance() {
        if (instance == null) instance = new ConfigManager();
        return instance;
    }

    public String getUrl() { return "http://api.com"; }
}

public class MyService {
    public void execute() {
        // Acceso global oculto
        String url = ConfigManager.getInstance().getUrl();
        System.out.println("Connecting to " + url);
    }
}
