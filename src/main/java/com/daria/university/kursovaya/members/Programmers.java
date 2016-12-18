package com.daria.university.kursovaya.members;


import com.daria.university.kursovaya.components.BackEndCode;
import com.daria.university.kursovaya.components.DataBase;

import java.util.ArrayList;
import java.util.List;

public class Programmers {

    private List<String> teamNames;
    private BackEndCode code;
    private DataBase dataBase;

    public Programmers(List<String> teamNames){
        this.teamNames = teamNames;
    }

}
