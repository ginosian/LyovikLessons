package com.company;

/**
 * Created by Martha on 25.02.15.
 */
public class EmployeeProfile extends EmployeeInformation {
    private EmployeeInformation employeeInformation;
    private int age;
    private double sallary;

    public EmployeeProfile() {
    }

    public EmployeeProfile(EmployeeInformation employeeInformation, int age, double sallary) {
        this.employeeInformation = employeeInformation;
        this.age = age;
        this.sallary = sallary;
    }

    public EmployeeInformation getEmployeeInformation() {
        return employeeInformation;
    }

    public void setEmployeeInformation(EmployeeInformation employeeInformation) {
        this.employeeInformation = employeeInformation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSallary() {
        return sallary;
    }

    public void setSallary(double sallary) {
        this.sallary = sallary;
    }
}
