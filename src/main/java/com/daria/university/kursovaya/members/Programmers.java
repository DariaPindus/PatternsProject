package com.daria.university.kursovaya.members;


import com.daria.university.kursovaya.service.StringsGenerator;
import com.daria.university.kursovaya.template.TeamTaskTemplate;

import java.util.List;
import java.util.Random;

public class Programmers extends TeamTaskTemplate{

    private List<String> teamNames;
    private StringBuilder code;
    private StringBuilder dataBase;
    private int deadLine = -1;

    public Programmers(){}

    public Programmers(List<String> teamNames){
        this.teamNames = teamNames;
        code = new StringBuilder();
        dataBase = new StringBuilder();
    }

    protected void showResults() {
        System.out.println("Written code by programmers:" + getCode());
        System.out.println("Written database: " + getDataBase());
    }

    public void executeCurrentTask() {
        writeDataBase();
        writeCode();
    }

    private void writeCode(){
        Random r = new Random();
        for (int i = 0 ; i < 3; i++){
            code.append(StringsGenerator.stringsForCode.get(r.nextInt(9)) + '\n');
        }
    }

    private void writeDataBase(){
        Random r = new Random();
        for (int i = 0 ; i < 3; i++){
            dataBase.append(StringsGenerator.stringsForDB.get(r.nextInt(8)) + '\n');
        }
    }

    public void planProject(){
        deadLine = new Random().nextInt(4) + 1;
        System.out.println("Planning project by programmers with setting deadLine: " + deadLine + " for execution stage");
    }

    public int getDeadLine(){
        return deadLine;
    }

    //TODO do it boolean
    public void test(){
        System.out.println("Programmers test their code");
    }

    public boolean testPassed(){
        return new Random().nextBoolean();
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

    public String getCode() {
        return code.toString();
    }

    public String getDataBase() {
        return dataBase.toString();
    }


}
