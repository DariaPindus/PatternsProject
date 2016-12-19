package com.daria.university.kursovaya;


import com.daria.university.kursovaya.commands.AnalyzeCommand;
import com.daria.university.kursovaya.decorators.Designer;
import com.daria.university.kursovaya.members.Manager;
import com.daria.university.kursovaya.members.Programmers;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //TODO add list of stuff
        ArrayList<Designer> designersStuff = new ArrayList<Designer>();
        ArrayList<String> programmersStuff = new ArrayList<String>();

        String managerN = "Rodolfo Allison";

/*        designersStuff.add();
        designersStuff.add("Priscilla King");
        programmersStuff.add("Emma Floyd");*/
        programmersStuff.add("Donald Myers");
        programmersStuff.add("Ricky Carlson");

        /*Designer designers = new Designer(designersStuff);*/
        Programmers programmers = new Programmers(programmersStuff);
        Manager manager = new Manager(managerN);

/*
        List<String> requirements = new ArrayList<String>();
        System.out.println("Please, enter your project requirements: ");
        Scanner scanner = new Scanner(System.in);
        String str = "";
        while (!str.equals("end")){
            str = scanner.nextLine();
            requirements.add(str);
        }
        scanner.close();
*/



       // AnalyzeCommand analyze = new AnalyzeCommand(designers, manager, requirements);

    }

}
