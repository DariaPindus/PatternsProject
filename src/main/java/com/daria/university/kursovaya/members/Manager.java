package com.daria.university.kursovaya.members;


import com.daria.university.kursovaya.template.TeamTaskTemplate;

import java.util.Map;

public class Manager extends TeamTaskTemplate{

    private Map<String, String> requirements;
    private String report;
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    protected void showResults() {
        System.out.println("Manager showing results in report:");
        System.out.println("Report: " + getReport());
    }

    public void executeCurrentTask() {

    }

    public Map<String, String> getRequirements() {
        return requirements;
    }

    public void setProjectRequirements(Map<String, String> requirements) {
        this.requirements = requirements;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }
}
