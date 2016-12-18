package com.daria.university.kursovaya.members;

import com.daria.university.kursovaya.components.Template;
import com.daria.university.kursovaya.template.TeamTaskTemplate;

import java.util.ArrayList;
import java.util.List;

public class Designer extends TeamTaskTemplate {

    private ArrayList<String> stuffNames;
    private Template template;

    public Designer(){
        template = new Template();
    }

    public Designer(ArrayList<String> stuff){
        stuffNames = stuff;
        template = new Template();
    }

    @Override
    public void doTask(int duration, List<String> requirements) {
        super.doTask(duration, requirements);
    }

    protected void showResults() {

    }

    public void executeCurrentTask() {

    }

    public void discussConcept(){
        System.out.println("Designers discuss site concept");
    }
}
