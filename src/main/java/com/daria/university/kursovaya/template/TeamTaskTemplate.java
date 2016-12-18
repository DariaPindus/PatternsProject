package com.daria.university.kursovaya.template;


import java.util.List;

public abstract class TeamTaskTemplate {
    private int duration;
    private List<String> requirements;

    public void doTask(int duration, List<String> requirements) {
        setDuration(duration);
        setRequirements(requirements);
        executeCurrentTask();
        showResults();
    }

    protected abstract void showResults();

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setRequirements(List<String> requirements) {
        this.requirements = requirements;
    }

    public abstract void executeCurrentTask();

}
