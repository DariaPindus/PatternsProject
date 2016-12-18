package com.daria.university.kursovaya.commands;

import com.daria.university.kursovaya.members.Designer;
import com.daria.university.kursovaya.members.Programmers;

public class ExecutionCommand implements Command{
    Designer designer;
    Programmers programmers;

    public ExecutionCommand(Designer designer, Programmers programmers) {
        this.designer = designer;
        this.programmers = programmers;
    }

    public void execute() {
        designer.executeCurrentTask();
        programmers.executeCurrentTask();
    }

    public void undo() {

    }
}
