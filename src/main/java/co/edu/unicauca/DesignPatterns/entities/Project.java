package co.edu.unicauca.DesignPatterns.entities;

import co.edu.unicauca.DesignPatterns.cor.ProjectHandler;

public class Project {
    private String name;
    private String description;
    private String status;
    private int complexity;

    public Project(String name, String description, int complexity) {
        this.name = name;
        this.description = description;
        this.complexity = complexity;
    }
    public String getName() {
        return name;
    }
    public void assigned(){
        this.status = "assigned";
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
}
