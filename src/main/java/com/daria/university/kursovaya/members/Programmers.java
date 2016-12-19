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
    private StringBuilder code;
    //private DataBase dataBase;
    private StringBuilder dataBase;
    private int deadLine;

    public Programmers(List<String> teamNames){
        this.teamNames = teamNames;
    }

    protected void showResults() {
        System.out.println("Written code by programmers:" + code);
        System.out.println("Written database: " + dataBase);
    }

    public void executeCurrentTask() {
        writeCode();
    }

    private void writeCode(){
        Random r = new Random();
        for (int i = 0 ; i < 3; i++){
            code.append(StringsGenerator.stringsForCode.get(r.nextInt(10)) + '\n');
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

    public void setDeadLine(int deadLine) {
        this.deadLine = deadLine;
    }

    public void clearCode() {
        code.setLength(0);
    }

    public void clearDataBase() {
        dataBase.setLength(0);
    }
}
