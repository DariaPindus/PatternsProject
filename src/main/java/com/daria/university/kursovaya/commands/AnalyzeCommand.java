package com.daria.university.kursovaya.commands;

import com.daria.university.kursovaya.members.Designer;
import com.daria.university.kursovaya.members.Manager;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class AnalyzeCommand implements Command{
    Designer designer;
    Manager manager;
    List<String> requirements;

    public AnalyzeCommand(Designer designer, Manager manager, List<String> requirements) {
        this.designer = designer;
        this.manager = manager;
        this.requirements = requirements;
    }

    public void execute() {
        designer.discussConcept();
        manager.setProjectRequirements(requirements);
        manager.doMainTask(new Random().nextInt(2)+1);
    }

    public void undo() {

    }
}
