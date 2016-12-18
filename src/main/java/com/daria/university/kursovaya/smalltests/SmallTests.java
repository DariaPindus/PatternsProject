package com.daria.university.kursovaya.smalltests;


public class SmallTests {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        child1.setValue(4);
        child1.print();
        System.out.println();
        Child2 child2 = new Child2();
        child2.setValue(6);
        child2.print();
        child1.print();
    }
}
