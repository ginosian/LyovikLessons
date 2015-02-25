package com.company;

import java.util.ArrayList;

/**
 * Created by Martha on 25.02.15.
 */
public class EmployiesList extends EmployeeProfile {

    private ArrayList <EmployeeProfile> employiesList;
    private EmployeeProfile employeeProfile;

    public EmployiesList() {
    }

    public EmployiesList(ArrayList<EmployeeProfile> employiesList, EmployeeProfile employeeProfile) {
        this.employiesList = employiesList;
        this.employeeProfile = employeeProfile;
    }

    public ArrayList<EmployeeProfile> getEmployiesList() {
        return employiesList;
    }

    public void setEmployiesList(ArrayList<EmployeeProfile> employiesList) {
        this.employiesList = employiesList;
    }

    public EmployeeProfile getEmployeeProfile() {
        return employeeProfile;
    }

    public void setEmployeeProfile(EmployeeProfile employeeProfile) {
        this.employeeProfile = employeeProfile;
    }

}
