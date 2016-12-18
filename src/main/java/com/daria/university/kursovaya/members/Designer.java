package com.daria.university.kursovaya.members;

import com.daria.university.kursovaya.components.Template;
import com.daria.university.kursovaya.template.TeamTaskTemplate;

import java.util.List;

public abstract class Designer extends TeamTaskTemplate {

    private List<String> teamNames;
    private Template template;

    public Designer(List<String> team){
        teamNames = team;
        template = new Template();
    }
/*
    @Override
    public void doMainTask() {

    }*/

    protected void showResults() {

    }

    public void executeCurrentTask() {

    }

    public void discussConcept(){
        System.out.println("Designers discuss site concept");
    }

    public void createTemplate(){
        template = new Template();
        template.setPsdTemplate("newTemplate.psd");
    }
}
