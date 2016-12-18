package com.daria.university.kursovaya.commands;

import com.daria.university.kursovaya.members.Designer;
import com.daria.university.kursovaya.members.Programmers;

public class PlanningCommand implements Command{
    Designer designer;
    Programmers programmers;

    public PlanningCommand(Designer designer, Programmers programmers) {
        this.designer = designer;
        this.programmers = programmers;
    }

    public void execute() {
        designer.createTemplate();
        //programmers.
    }

    public void undo() {

    }
}
