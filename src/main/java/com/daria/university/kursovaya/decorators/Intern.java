package com.daria.university.kursovaya.decorators;


public class Intern extends Designer{

    public Intern(String name) {
        this.name = "Intern " + name;
    }

    public String writePartOfTemplate() {
        return "This code is working but lack experience";
    }

    public void makeAnIdea() {
        this.idea = "Simple idea by intern, knowing basic concepts.";
    }
}
