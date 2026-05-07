public interface Database {
    void save(String data);
}

public class ReportService {
    private final Database database;

    // Acoplamiento debil: dependemos de una abstraccion
    public ReportService(Database database) {
        this.database = database;
    }

    public void createReport(String data) {
        database.save(data);
    }
}
