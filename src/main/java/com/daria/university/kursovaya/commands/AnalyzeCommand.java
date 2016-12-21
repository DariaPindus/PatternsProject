package com.daria.university.kursovaya.commands;

import com.daria.university.kursovaya.decorators.Designer;
import com.daria.university.kursovaya.members.Designers;
import com.daria.university.kursovaya.members.Manager;

import java.util.List;
import java.util.Random;

public class AnalyzeCommand implements Command{
    Designers designers;
    Manager manager;
    List<String> requirements;

    public AnalyzeCommand(Designers designer, Manager manager, List<String> requirements) {
        this.designers = designer;
        this.manager = manager;
        this.requirements = requirements;
    }

    public void execute() {
        manager.setProjectRequirements(requirements);
        manager.doMainTask(new Random().nextInt(2)+1);
        designers.discussConcept();
        System.out.println("====================\n");
    }

    public void undo() {
        System.out.println("\nUndoing analyzing");
        manager.setProjectRequirements(null);
        manager.clearReport();
        System.out.println("====================\n");
    }
}
