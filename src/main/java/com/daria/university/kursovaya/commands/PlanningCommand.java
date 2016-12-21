package com.daria.university.kursovaya.commands;

import com.daria.university.kursovaya.decorators.Designer;
import com.daria.university.kursovaya.members.Designers;
import com.daria.university.kursovaya.members.Programmers;

public class PlanningCommand implements Command{
    Designers designers;
    Programmers programmers;

    public PlanningCommand(Designers designers, Programmers programmers) {
        this.designers = designers;
        this.programmers = programmers;
    }

    public void execute() {
        designers.makeIdeas();
        designers.createTemplate();
        programmers.planProject();
        System.out.println("====================\n");
    }

    public void undo() {
        System.out.println("\nUndoing planning");
        designers.clearPsd();
        programmers.setDeadLine(-1);
        System.out.println("====================\n");
    }
}
