package co.edu.unicauca.DesignPatterns.cor;

import co.edu.unicauca.DesignPatterns.entities.Project;

public class EthicalEvaluator extends  ProjectHandler{

    @Override
    public boolean handle(Project project){
        if(project.getComplexity()<=10){
            System.out.println("Ethical evaluation passed");
            return true;
        }
        next.handle(project);
        return false;
    }
}
