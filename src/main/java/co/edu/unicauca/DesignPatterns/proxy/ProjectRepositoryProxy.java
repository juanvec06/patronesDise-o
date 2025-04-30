package co.edu.unicauca.DesignPatterns.proxy;

public class ProjectRepositoryProxy implements ProjectRepository {

    private RealProjectRepository realRepo;
    private String user;
    private String password;

    public ProjectRepositoryProxy(String user,String password){
        realRepo = new RealProjectRepository();
        this.user = user;
        this.password = password;
    }

    @Override
    public void saveProject(String projectName) {
        if (authenticate()){
            realRepo.saveProject(projectName);
        }
        else{
            System.out.println("Unauthorized access");
        }
    }

    private boolean authenticate(){
        return "admin".equals(user) && "1234".equals(password);
    }
}
