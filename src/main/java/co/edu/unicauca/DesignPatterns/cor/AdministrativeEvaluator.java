package co.edu.unicauca.DesignPatterns.cor;

import co.edu.unicauca.DesignPatterns.entities.Project;

public class AdministrativeEvaluator extends ProjectHandler{

    @Override
    public boolean handle(Project project){
        if (project.getComplexity()<=7){
            return true;
        }
        return false;
    }
}
