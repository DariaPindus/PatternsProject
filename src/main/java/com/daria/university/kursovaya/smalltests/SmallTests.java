package com.daria.university.kursovaya.smalltests;


import com.daria.university.kursovaya.commands.AnalyzeCommand;
import com.daria.university.kursovaya.commands.Command;
import com.daria.university.kursovaya.commands.TestingCommand;
import com.daria.university.kursovaya.decorators.Designer;
import com.daria.university.kursovaya.members.Programmers;

import java.util.ArrayList;

public class SmallTests {
    public static void main(String[] args) {
/*        Child1 child1 = new Child1();
        child1.setValue(4);
        child1.print();
        System.out.println();
        Child2 child2 = new Child2();
        child2.setValue(6);
        child2.print();
        child1.print();*/
        System.out.println(Designer.class.getSimpleName()); //returns only Designer
        ArrayList<String> a = new ArrayList<String>();
        a.add("dddd");
        a.add("bbbb");
        Command command = new TestingCommand(new Programmers(a));
        System.out.println(command.getClass().getName());
    }
}
