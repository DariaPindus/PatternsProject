package com.daria.university.kursovaya.decorators;


public class Intern extends Designer{
    public Intern(String n) {
        super(n);
    }

    public String writePartOfTemplate() {
        return "This code is working but lack experience";
    }

    public void makeAnIdea() {
        super.setIdea("Simple idea by intern, knowing basic concepts.");
    }

    public String getIdea(){
        return idea;
    }
}
