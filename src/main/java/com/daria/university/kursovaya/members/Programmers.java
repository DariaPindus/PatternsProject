package com.daria.university.kursovaya.members;


import com.daria.university.kursovaya.components.BackEndCode;
import com.daria.university.kursovaya.components.DataBase;
import com.daria.university.kursovaya.template.TeamTaskTemplate;

import java.util.ArrayList;
import java.util.List;

public class Programmers extends TeamTaskTemplate{

    private List<String> teamNames;
    private BackEndCode code;
    private DataBase dataBase;

    public Programmers(List<String> teamNames){
        this.teamNames = teamNames;
    }

    protected void showResults() {

    }

    public void executeCurrentTask() {

    }

    //for TestingCommand
    public void test(){
        System.out.println("Programmers test their code");
    }
}
