package com.daria.university.kursovaya.commands;

import com.daria.university.kursovaya.members.Programmers;

public class TestingCommand implements Command{
    Programmers programmers;

    public TestingCommand(Programmers programmers) {
        this.programmers = programmers;
    }

    public void execute() {
        programmers.test();
    }

    public void undo() {

    }
}
