package co.edu.unicauca.DesignPatterns.composite;

public class CompositeTask implements ProjectComponent{

    private String name;
    private ProjectComponent[] components;

    public CompositeTask(String name) {
        components = new ProjectComponent[10];
        this.name = name;
    }


    @Override
    public void showDetails() {
        for(ProjectComponent component : components){
            if(component==null) continue;
            component.showDetails();
        }
    }

    public void add(ProjectComponent component){
        for(int i=0; i<components.length; i++){
            if(components[i]==null){
                components[i] = component;
                return;
            }
        }
    }
    public void remove(ProjectComponent component){
        for(int i=0; i<components.length; i++){
            if(components[i].equals(component)){
                components[i] = null;
            }
        }
    }
    public ProjectComponent[] getComponents(){
        return components;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
