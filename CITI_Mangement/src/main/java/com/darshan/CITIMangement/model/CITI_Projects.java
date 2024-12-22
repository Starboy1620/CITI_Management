package com.darshan.CITIMangement.model;

import org.springframework.stereotype.Component;
import java.util.List;


@Component
public class CITI_Projects {

    private int project_Id;
    private String project_Name;
    private int employee_Numbers;
    private double budget;
    private List<String> postTechStack;


    public CITI_Projects(){

    }
    public CITI_Projects(int project_Id, String project_Name, int employee_Numbers, double budget, List<String> postTechStack) {
        this.project_Id = project_Id;
        this.project_Name = project_Name;
        this.employee_Numbers = employee_Numbers;
        this.budget = budget;
        this.postTechStack = postTechStack;
    }

    public List<String> getPostTechStack() {
        return postTechStack;
    }

    public void setPostTechStack(List<String> postTechStack) {
        this.postTechStack = postTechStack;
    }

    public int getProject_Id() {
        return project_Id;
    }

    public void setProject_Id(int project_Id) {
        this.project_Id = project_Id;
    }

    public String getProject_Name() {
        return project_Name;
    }

    public void setProject_Name(String project_Name) {
        this.project_Name = project_Name;
    }

    public int getEmployee_Numbers() {
        return employee_Numbers;
    }

    public void setEmployee_Numbers(int employee_Numbers) {
        this.employee_Numbers = employee_Numbers;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }


}
