package com.daria.university.kursovaya.decorators;


public abstract class SkillsDecorator extends Designer{
    public SkillsDecorator(String name) {
        super(name);
    }

    public abstract String writePartOfTemplate();
}
