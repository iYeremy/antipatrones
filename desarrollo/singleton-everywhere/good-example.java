public class Config {
    private final String url;
    public Config(String url) { this.url = url; }
    public String getUrl() { return url; }
}

public class MyService {
    private final Config config;

    // La dependencia es explicita y facil de probar
    public MyService(Config config) {
        this.config = config;
    }

    public void execute() {
        System.out.println("Connecting to " + config.getUrl());
    }
}
