package com.daria.university.kursovaya.commands;

import com.daria.university.kursovaya.members.Designer;
import com.daria.university.kursovaya.members.Manager;

public class AnalyzeCommand implements Command{
    Designer designer;
    Manager manager;

    public void execute() {
        designer.discussConcept();
        //manager.
    }

    public void undo() {

    }
}
