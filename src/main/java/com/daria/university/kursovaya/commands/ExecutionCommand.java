package com.daria.university.kursovaya.commands;

import com.daria.university.kursovaya.members.Designer;
import com.daria.university.kursovaya.members.Programmers;

import java.util.Random;

public class ExecutionCommand implements Command{
    Designer designer;
    Programmers programmers;

    public ExecutionCommand(Designer designer, Programmers programmers) {
        this.designer = designer;
        this.programmers = programmers;
    }

    public void execute() {
        designer.doMainTask(new Random().nextInt(4) + 1);
        programmers.doMainTask(new Random().nextInt(4)+2);
    }

    public void undo() {

    }
}
