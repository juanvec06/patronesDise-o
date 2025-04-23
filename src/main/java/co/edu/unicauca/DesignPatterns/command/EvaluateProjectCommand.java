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
            project.setStatus("Denied");
        }
        else{
            project.setStatus("Accepted");
        }
    }
}
