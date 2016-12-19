package com.daria.university.kursovaya.members;


import com.daria.university.kursovaya.template.TeamTaskTemplate;

import java.util.List;
import java.util.Map;

public class Manager extends TeamTaskTemplate{

    private List<String> requirements;
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
        setReport();
        System.out.println("Manager preparing requirements and doing its main job");
    }

//    public Map<String, String> getRequirements() {
//        return requirements;
//    }

    public void setProjectRequirements(List<String> requirements) {
        this.requirements = requirements;
    }

    public String getReport() {
        return report;
    }

    public void setReport() {
        this.report = "We've created plan according to all clients requirements.";
    }
}
