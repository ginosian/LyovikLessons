package com.company;

import java.util.ArrayList;

/**
 * Created by Martha on 25.02.15.
 */
public class EmployeeProfile extends EmployeeInformation {
    private EmployeeInformation employeeInformation;
    private ArrayList <EmployeeInformation> employeeProfile;


    public EmployeeProfile() {
    }

    public EmployeeProfile(EmployeeInformation employeeInformation, ArrayList<EmployeeInformation> employeeProfile) {
        this.employeeInformation = employeeInformation;
        this.employeeProfile = employeeProfile;
    }

    public EmployeeProfile(String name, String surname, char gender, int age, double sallary, EmployeeInformation employeeInformation, ArrayList<EmployeeProfile> employeeProfile) {
        super(name, surname, gender, age, sallary);
        this.employeeInformation = employeeInformation;

    }

    public EmployeeInformation getEmployeeInformation() {
        return employeeInformation;
    }

    public void setEmployeeInformation(EmployeeInformation employeeInformation) {
        this.employeeInformation = employeeInformation;
    }

    public ArrayList<EmployeeInformation> getEmployeeProfile() {
        return employeeProfile;
    }

    public void setEmployeeProfile(ArrayList<EmployeeInformation> employeeProfile) {
        this.employeeProfile = employeeProfile;
    }

    public void employeeProfileMaker(EmployeeInformation inputEmployeeInformation){
        employeeProfile.add(inputEmployeeInformation);

    }

    public void employeeProfilePrint(){

        employeeInformation.employeeInformationPrint();
    }
}
