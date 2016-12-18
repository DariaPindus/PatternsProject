package com.daria.university.kursovaya.commands;

import com.daria.university.kursovaya.members.Designer;
import com.daria.university.kursovaya.members.Manager;

import java.util.Map;

public class AnalyzeCommand implements Command{
    Designer designer;
    Manager manager;
    Map<String, String> requirements;

    public AnalyzeCommand(Designer designer, Manager manager) {
        this.designer = designer;
        this.manager = manager;
    }

    public void execute() {
        designer.discussConcept();
        manager.setProjectRequirements(requirements);
    }

    public void undo() {

    }

    public void setRequirements(Map<String, String> requirements){
        this.requirements = requirements;
    }
}
