package com.daria.university.kursovaya.decorators;


public class EmployedDesigner extends Designer{

    public EmployedDesigner(String n) {
        name = "Employee " + n;
    }

    public String writePartOfTemplate() {
        return "This code must consist well-designed code";
    }

    public void makeAnIdea() {
        this.idea = "Significant idea by employed designer with experience in this stuff";
    }
/*
    public String createPsdTemplate(){
        System.out.println("Empleyed designer creating psd template");
        return "psdTemplate.psd";
    }*/
}
