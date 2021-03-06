package com.daria.university.kursovaya.commands;

import com.daria.university.kursovaya.members.Programmers;

public class TestingCommand implements Command{
    private Programmers programmers;
    private boolean result;

    public TestingCommand(Programmers programmers) {
        this.programmers = programmers;
    }

    public void execute() {
        result = programmers.testPassed();
        System.out.println("Programmers test passed successfully: " + result);
        System.out.println("====================\n");
    }

    public void undo() {
        System.out.println("\nUndoing testing");
        result = false;
        System.out.println("====================\n");
    }

    public boolean getResult(){
        return result;
    }
}
