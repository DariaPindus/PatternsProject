package com.daria.university.kursovaya.smalltests;

/**
 * Created by daria_p on 14.12.16.
 */
public class Child1 extends Base {

    @Override
    public void setValue(int v) {
        super.setValue(v);
    }

    public void print() {
        System.out.println("In child 1 \n Value = " + this.getValue());
    }

    @Override
    public String toString() {
        return "Child1 val= " + getValue();
    }
}
