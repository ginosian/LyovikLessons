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


    public void setEmployeeProfile(EmployeeProfile employeeProfile) {
        this.employeeProfile = employeeProfile;
    }

    public void employiesListMaker(EmployeeProfile inputEmployeeProfile){
        employiesList.add(inputEmployeeProfile);
    }

    public void employiesListPrint(){
        for (int i = 0; i<this.employiesList.size(); i++){
            System.out.print((i+1) + ". ");
            employiesList.get(i).employeeInformationPrint();
            System.out.println();

        }
    }
}
