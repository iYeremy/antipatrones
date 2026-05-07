public class MySQLDatabase {
    public void save(String data) {
        System.out.println("Saving to MySQL");
    }
}

public class ReportService {
    // Acoplamiento fuerte: dependencia directa de una clase concreta
    private MySQLDatabase db = new MySQLDatabase();

    public void createReport(String data) {
        db.save(data);
    }
}
