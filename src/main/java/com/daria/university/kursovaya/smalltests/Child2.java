package com.daria.university.kursovaya.smalltests;


public class Child2 extends Base{
    @Override
    public void setValue(int v) {
        super.setValue(v);
    }

    public void print() {
        System.out.println("In child 2 \n Value = " + this.getValue());
    }

    @Override
    public String toString() {
        return "Child2 val= " + getValue();
    }
}
