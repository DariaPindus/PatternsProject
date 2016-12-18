package com.daria.university.kursovaya.decorators;


import com.daria.university.kursovaya.members.Designer;

import java.util.List;

public abstract class SkillsDecorator extends Designer{

    public SkillsDecorator(List<String> team) {
        super(team);
    }
}
