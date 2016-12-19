package com.daria.university.kursovaya.members;


import com.daria.university.kursovaya.components.BackEndCode;
import com.daria.university.kursovaya.components.DataBase;
import com.daria.university.kursovaya.service.StringsGenerator;
import com.daria.university.kursovaya.template.TeamTaskTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Programmers extends TeamTaskTemplate{

    private List<String> teamNames;
    //private BackEndCode code;
    private String code;
    //private DataBase dataBase;
    private String dataBase;
    private int deadLine;

    public Programmers(List<String> teamNames){
        this.teamNames = teamNames;
    }

    protected void showResults() {
        //does it make sense?
        System.out.println(code);
    }

    public void executeCurrentTask() {
        writeCode();
    }

    private void writeCode(){
        Random r = new Random();
        for (int i = 0 ; i < r.nextInt(2)+1; i++){
            code += StringsGenerator.stringsForCode.get(r.nextInt(10));
        }
    }

    public void planProject(){
        deadLine = new Random().nextInt(4) + 1;
        System.out.println("Planning project by programmers with setting deadLine for execution stage");
    }

    public int getDeadLine(){
        return deadLine;
    }

    //for TestingCommand
    public void test(){
        System.out.println("Programmers test their code");
    }
}
