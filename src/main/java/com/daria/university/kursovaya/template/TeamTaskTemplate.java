package com.daria.university.kursovaya.template;


import java.util.List;

public abstract class TeamTaskTemplate {
    private int mainDuration;

    public final void doMainTask(int dur) {
        System.out.println("Team doing its main task");
        discussPlans();
        setMainDuration(dur);
        executeCurrentTask();
        showResults();
    }

    protected abstract void showResults();

    void discussPlans(){
        System.out.println("Team is discussing their plans");
    }

    void setMainDuration(int mainDuration) {
        System.out.println("Stage duration was set: " + mainDuration);
        this.mainDuration = mainDuration;
    }

    protected abstract void executeCurrentTask();

}
