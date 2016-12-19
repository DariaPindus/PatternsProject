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
    }

    public void undo() {
        //TODO should there be smth more??
        result = false;
    }

    public boolean getResult(){
        return result;
    }
}
