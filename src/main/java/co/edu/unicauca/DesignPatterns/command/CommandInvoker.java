package co.edu.unicauca.DesignPatterns.command;

import java.util.List;

public class CommandInvoker {
    private List<Command> commands;

    public CommandInvoker() {}
    public  CommandInvoker(List<Command> command) {
        this.commands = command;
    }

    public void addCommand(Command command){
        this.commands.add(command);
    }
    public void executeCommands(){
        for(Command command : commands){
            command.execute();
        }
    }
}
