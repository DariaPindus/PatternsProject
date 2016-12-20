package com.daria.university.kursovaya.decorators;

import com.daria.university.kursovaya.components.Template;
import com.daria.university.kursovaya.template.TeamTaskTemplate;

import java.util.List;

public abstract class Designer {

    protected String name = "Initial name";
    protected String idea = "Unknown idea";
    protected String partOfCode;

    public Designer(String name){
        this.name = name;
    }

    //TODO check if this is correct
    public abstract String writePartOfTemplate(); //throws IllegalAccessException { throw new IllegalAccessException("Concrete class is needed");}

    public void makeAnIdea() throws IllegalAccessException { throw new IllegalAccessException("Concrete class is needed");}

    public String getIdea(){
        return idea;
    }

    public String getName() { return  name;}

    public void setIdea(String idea) {
        this.idea = idea;
    }
}
