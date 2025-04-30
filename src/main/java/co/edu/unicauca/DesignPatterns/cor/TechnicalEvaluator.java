package co.edu.unicauca.DesignPatterns.cor;

import co.edu.unicauca.DesignPatterns.entities.Project;

public class TechnicalEvaluator extends ProjectHandler {

    @Override
    public boolean handle(Project project){
        if(project.getComplexity()<=5){
            System.out.println("Technical evaluation passed");
            return true;
        }
        next.handle(project);
        return false;
    }
}
