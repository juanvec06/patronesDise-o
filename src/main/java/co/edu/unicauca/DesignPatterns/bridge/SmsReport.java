package co.edu.unicauca.DesignPatterns.bridge;

public class SmsReport extends ProjectReport{
    public SmsReport(ReportFormatter reportFormatter) {
        super(reportFormatter);
    }
    @Override
    public void generate(String content) {
        formatter.format(content);
    }
}
