package co.edu.unicauca.DesignPatterns;

import co.edu.unicauca.DesignPatterns.bridge.*;
import co.edu.unicauca.DesignPatterns.command.AssignProjectCommand;
import co.edu.unicauca.DesignPatterns.command.Command;
import co.edu.unicauca.DesignPatterns.command.EvaluateProjectCommand;
import co.edu.unicauca.DesignPatterns.entities.Project;
import co.edu.unicauca.DesignPatterns.command.CommandInvoker;
import co.edu.unicauca.DesignPatterns.memento.Caretaker;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // ------------------ COMMAND ------------------
        System.out.println("\n--- Command Pattern ---");
        Project project = new Project("Inventory System");
        project.setComplexity(8);
        Command assignCommand = new AssignProjectCommand(project);
        Command evaluateCommand = new EvaluateProjectCommand(project);
        CommandInvoker invoker = new CommandInvoker();
        invoker.addCommand(assignCommand);
        invoker.addCommand(evaluateCommand);
        invoker.executeCommands();
//        // ------------------ CHAIN OF RESPONSIBILITY ------------------
//        System.out.println("\n--- Chain of Responsibility ---");
//        Manager manager = new Manager();
//        manager.createAuthorizationFlow();
//        Project project2 = new Project("Academic System");
//        project2.setComplexity(9);
//        manager.getTechnicalEvaluator().handle(project2);
        // ------------------ MEMENTO ------------------
        System.out.println("\n--- Memento Pattern ---");
        Project statefulProject = new Project("eCommerce App");
        Caretaker caretaker = new Caretaker();
        caretaker.addMemento(statefulProject.saveToMemento());

        statefulProject.setStatus("In Progress");
        System.out.println("Current state: " + statefulProject.getStatus());
        caretaker.addMemento(statefulProject.saveToMemento());

        statefulProject.restoreFromMemento(caretaker.getMemento(0));
        System.out.println("Restored state: " + statefulProject.getStatus());
        statefulProject.restoreFromMemento(caretaker.getMemento(1));
        System.out.println("Restored state: " + statefulProject.getStatus());
//        // ------------------ COMPOSITE ------------------
//        System.out.println("\n--- Composite Pattern ---");
//        CompositeTask mainTask = new CompositeTask("Develop Project");
//        mainTask.add(new Task("Requirement Analysis"));
//        mainTask.add(new Task("Implementation"));
//        mainTask.showDetails();
        // ------------------ BRIDGE ------------------
        System.out.println("\n--- Bridge Pattern ---");
        ProjectReport smsReport = new SmsReport(new HtmlReportFormatter());
        smsReport.generate("Project completed with success");

        ProjectReport emailReport = new EmailReport(new JsonReportFormatter());
        emailReport.generate("Project completed with success");
//        ----------- PROXY ------------------
//        System.out.println("\n--- Proxy Pattern ---");
//        ProjectRepositoryProxy("admin", "1234");
//        repo.saveProject("Blockchain System");
    }
}