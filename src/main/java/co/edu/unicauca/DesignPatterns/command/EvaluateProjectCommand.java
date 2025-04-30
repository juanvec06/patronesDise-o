package co.edu.unicauca.DesignPatterns.command;

import co.edu.unicauca.DesignPatterns.cor.ProjectHandler;
import co.edu.unicauca.DesignPatterns.entities.Project;

public class EvaluateProjectCommand implements Command {
    private Project project;

    public EvaluateProjectCommand(Project project) {
        this.project = project;
    }

    @Override
    public void execute() {
        if(project.getComplexity() > 5){
            project.setStatus("Rejected");
            System.out.println("Project "+project.getName()+" Rejected, it's too complex");
        }
        else{
            project.setStatus("Accepted");
            System.out.println("Project Accepted");
        }
    }
}
