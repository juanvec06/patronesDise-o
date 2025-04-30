package co.edu.unicauca.DesignPatterns.cor;

public class Manager {
    private ProjectHandler technicalEvaluator;
    private ProjectHandler administrativeEvaluator;
    private ProjectHandler ethicalEvaluator;
    public Manager() {
        technicalEvaluator = new TechnicalEvaluator();
        administrativeEvaluator = new AdministrativeEvaluator();
        ethicalEvaluator = new EthicalEvaluator();
    }

    public void createAuthorizationFlow(){
        technicalEvaluator.setNext(administrativeEvaluator);
        administrativeEvaluator.setNext(ethicalEvaluator);
    }
    public ProjectHandler getTechnicalEvaluator(){
        return technicalEvaluator;
    }
}
