package com.daria.university.kursovaya;

import com.daria.university.kursovaya.commands.Command;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProjectHandler {
    private List<Command> stages = new ArrayList<Command>();

    public ProjectHandler(){

    }

    public void addProjectStage(Command command){
        stages.add(command);
    }

    public void executeProject(){
        Scanner sc = new Scanner(System.in);/*
        for (Command c : stages) {
            c.execute();
            System.out.println("Command " + c.getClass().getSimpleName() + " was executed.\n " +
                    "Are you satisfied with result? (y/n)");
            String ans = sc.nextLine();
            if (ans.equals("y"))
                continue;
            else if (ans.equals("n"))
                c.undo();c.execute();*/
        for (int i = 0; i < stages.size(); i++){
            executeStage(i);
        }
    }

    private boolean executeStage(int i){
        stages.get(i).execute();
        Scanner sc = new Scanner(System.in);
        System.out.println("Command " + stages.get(i).getClass().getSimpleName() + " was executed.\n " +
                "Are you satisfied with result? (y/n)");
        String ans = sc.nextLine();
        if (!ans.equals("y")) {
            stages.get(i).undo();
            executeStage(i);
        }
        return true;
    }
}
