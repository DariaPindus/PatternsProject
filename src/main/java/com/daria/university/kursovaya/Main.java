package com.daria.university.kursovaya;


import com.daria.university.kursovaya.commands.AnalyzeCommand;
import com.daria.university.kursovaya.commands.ExecutionCommand;
import com.daria.university.kursovaya.commands.PlanningCommand;
import com.daria.university.kursovaya.commands.TestingCommand;
import com.daria.university.kursovaya.decorators.*;
import com.daria.university.kursovaya.members.Designers;
import com.daria.university.kursovaya.members.Manager;
import com.daria.university.kursovaya.members.Programmers;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProjectHandler projectHandler = new ProjectHandler();

        //TODO add list of stuff
        //ArrayList<Designer> designersStuff = new ArrayList<Designer>();
        ArrayList<String> programmersStuff = new ArrayList<String>();

        String managerN = "Rodolfo Allison";

        programmersStuff.add("Emma Floyd");
        programmersStuff.add("Donald Myers");
        programmersStuff.add("Ricky Carlson");

        /*Designer designers = new Designer(designersStuff);*/
        Designers designers = new Designers(fillDesigners());
        System.out.println(designers.toString());
        Programmers programmers = new Programmers(programmersStuff);
        Manager manager = new Manager(managerN);

        List<String> requirements = new ArrayList<String>();
        requirements.add("First dumb req");
        requirements.add("Seconf req");
        requirements.add("Third req");
/*
        System.out.println("Please, enter your project requirements: ");
        Scanner scanner = new Scanner(System.in);
        String str = "";
        while (!str.equals("end")){
            str = scanner.nextLine();
            requirements.add(str);
        }
        scanner.close();
*/

        AnalyzeCommand analyze = new AnalyzeCommand(designers, manager, requirements);
        PlanningCommand planning = new PlanningCommand(designers, programmers);
        ExecutionCommand execution = new ExecutionCommand(designers, programmers);
        TestingCommand testing = new TestingCommand(programmers);

        projectHandler.addProjectStage(analyze);
        projectHandler.addProjectStage(planning);
        projectHandler.addProjectStage(execution);
        projectHandler.addProjectStage(testing);

        projectHandler.executeProject();
    }

    private static List<Designer> fillDesigners(){
        List<Designer> des = new ArrayList<Designer>();
        Designer intern = new Intern("Conrad Smith");
        Designer empl = new EmployedDesigner("Jeremy Bayrons");
        intern = new CMSKnowledge(intern);
        empl = new CMSKnowledge(empl);
        empl = new RawTechnologiesKnowledge(empl);
        des.add(intern);
        des.add(empl);
        return des;
    }

}
