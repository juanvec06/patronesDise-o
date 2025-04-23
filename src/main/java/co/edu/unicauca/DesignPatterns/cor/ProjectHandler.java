package co.edu.unicauca.DesignPatterns.cor;

import co.edu.unicauca.DesignPatterns.entities.Project;

public abstract class ProjectHandler {

    protected ProjectHandler next;

    public void setNext(ProjectHandler next){
        this.next = next;
    }
    public abstract boolean handle(Project project);

    public ProjectHandler getNextHandler(){
        return next;
    }
}
