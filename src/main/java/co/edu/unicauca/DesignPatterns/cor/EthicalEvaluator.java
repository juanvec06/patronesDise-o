package co.edu.unicauca.DesignPatterns.cor;

import co.edu.unicauca.DesignPatterns.entities.Project;

public class EthicalEvaluator extends  ProjectHandler{

    @Override
    public boolean handle(Project project){
        if(project.getComplexity()<=10){
            return true;
        }
        return false;
    }
}
