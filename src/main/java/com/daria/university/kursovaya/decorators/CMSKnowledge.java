package com.daria.university.kursovaya.decorators;


public class CMSKnowledge extends SkillsDecorator {

    private Designer designer;

    public CMSKnowledge(Designer designer) {
        super(designer.getName());
        this.designer = designer;
    }

    public String writePartOfTemplate() {
        return designer.writePartOfTemplate() + " adding basic CMS Wordpress markup";
    }

    public void makeAnIdea() {
        try {
            designer.makeAnIdea();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
