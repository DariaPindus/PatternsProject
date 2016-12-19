package com.daria.university.kursovaya.decorators;


public class RawTechnologiesKnowledge extends SkillsDecorator{

    Designer designer;

    public RawTechnologiesKnowledge(Designer designer) {
        this.designer = designer;
    }

    public String writePartOfTemplate() {
        return designer.writePartOfTemplate() + "some php/angular/jquery code";
    }

    public void makeAnIdea() {
        try {
            super.makeAnIdea();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
