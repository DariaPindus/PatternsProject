package com.daria.university.kursovaya.smalltests;

public abstract class Base {
    private int value;

    public void setValue(int v){
        System.out.println("In base class");
        value = v;
        print();
    }

    public abstract void print();

    public int getValue() {
        return value;
    }
}
