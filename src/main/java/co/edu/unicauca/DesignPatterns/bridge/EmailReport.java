package co.edu.unicauca.DesignPatterns.bridge;

public class EmailReport extends ProjectReport{
    public  EmailReport(ReportFormatter reportFormatter) {
        super(reportFormatter);
    }
    @Override
    public void generate(String content) {
        formatter.format(content);
    }
}
