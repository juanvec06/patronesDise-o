package co.edu.unicauca.DesignPatterns.proxy;

public class RealProjectRepository implements ProjectRepository {

    @Override
    public void saveProject(String projectName) {
        System.out.println("Saving project: " + projectName);
    }
}
