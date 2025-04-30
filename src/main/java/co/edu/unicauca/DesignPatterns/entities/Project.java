package co.edu.unicauca.DesignPatterns.entities;

import co.edu.unicauca.DesignPatterns.cor.ProjectHandler;

public class Project {
    private String name;
    private String description;
    private String status;
    private int complexity;

    public Project(String name) {
        this.name = name;
        this.description = "";
        this.status = "Created";
        this.complexity = 0;
    }
    public Project(String name, String description, int complexity) {
        this.name = name;
        this.description = description;
        this.complexity = complexity;
    }
    public String getName() {
        return name;
    }
    public String getStatus(){
        return status;
    }
    public String getDescription() {
        return description;
    }
    public int  getComplexity() {
        return complexity;
    }
    public void setStatus(String status){
        this.status = status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setComplexity(int complexity) {
        this.complexity = complexity;
    }
    public class Memento{
        private String name;
        private String description;
        private String status;
        private int complexity;
        private Memento(String name,String description,String status,int complexity){
            this.name=name;
            this.description=description;
            this.status=status;
            this.complexity=complexity;
        }
    }
    public Memento saveToMemento(){
        return new Memento(name,description,status,complexity);
    }
    public void restoreFromMemento(Memento memento){
        name = memento.name;
        description = memento.description;
        status = memento.status;
        complexity = memento.complexity;
    }
}
