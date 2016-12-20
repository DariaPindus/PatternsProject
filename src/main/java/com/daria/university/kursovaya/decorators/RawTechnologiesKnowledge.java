package com.daria.university.kursovaya.decorators;


public class RawTechnologiesKnowledge extends SkillsDecorator{

    Designer designer;

    public RawTechnologiesKnowledge(Designer designer) {
        super(designer.getName());
        this.designer = designer;
    }

    public String writePartOfTemplate() {
        return designer.writePartOfTemplate() + ", some php/angular/jquery code";
    }

    public void makeAnIdea() {
        try {
            designer.makeAnIdea();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public String getIdea() {
        return designer.getIdea();
    }
}
