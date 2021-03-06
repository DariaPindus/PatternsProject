package com.daria.university.kursovaya.commands;

import com.daria.university.kursovaya.decorators.Designer;
import com.daria.university.kursovaya.members.Designers;
import com.daria.university.kursovaya.members.Programmers;

import java.util.Random;

public class ExecutionCommand implements Command{
    Designers designers;
    Programmers programmers;

    public ExecutionCommand(Designers designers, Programmers programmers) {
        this.designers = designers;
        this.programmers = programmers;
    }

    public void execute() {
        designers.doMainTask(new Random().nextInt(4) + 1);
        programmers.doMainTask(programmers.getDeadLine());
        System.out.println("====================\n");
    }

    public void undo() {
        System.out.println("\nUndoing execution stage");
        designers.clearCode();
        programmers.clearCode();
        programmers.clearDataBase();
        System.out.println("====================\n");
    }
}
