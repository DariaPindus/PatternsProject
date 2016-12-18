package com.daria.university.kursovaya.template;


import java.util.List;

public abstract class TeamTaskTemplate {
    private int mainDuration;
    private List<String> mainRequirements;

    final void doMainTask() {
        discussPlans();
        setMainDuration(mainDuration);
        setMainRequirements(mainRequirements);
        executeCurrentTask();
        showResults();
    }

    protected abstract void showResults();

    public void discussPlans(){
        System.out.println("Team is discussing their plans");
    }

    void setMainDuration(int mainDuration) {
        this.mainDuration = mainDuration;
    }

    public void setMainRequirements(List<String> mainRequirements) {
        this.mainRequirements = mainRequirements;
    }

    public abstract void executeCurrentTask();

}
