package com.daria.university.kursovaya.members;

import com.daria.university.kursovaya.components.Template;
import com.daria.university.kursovaya.decorators.Designer;
import com.daria.university.kursovaya.template.TeamTaskTemplate;

import java.util.List;


public class Designers extends TeamTaskTemplate {
    private Template template;
    private List<Designer> designers;

    public Designers(List<Designer> designers){
        this.designers = designers;
    }

    protected void showResults() {

    }

    protected void executeCurrentTask() {

    }

    public void discussConcept(){
        System.out.println("Designers discuss site concept");
    }

    public void createTemplate(){
        template = new Template();
        template.setPsdTemplate("newTemplate.psd");
    }

    public void setTemplate(Template t){
        template = t;
    }

    public void clearPsd(){
        template.setPsdTemplate(null);
    }

    public void makeIdeas(){
        try {
            for (Designer d : designers) {
                d.makeAnIdea();
                System.out.println("Designer " + d.getName() + " came up with idea: " + d.getIdea());
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
