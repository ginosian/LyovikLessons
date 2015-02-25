package com.company;

/**
 * Created by Martha on 25.02.15.
 */
public class EmployeeInformation {
    private String name;
    private String surname;
    private char gender;

    public EmployeeInformation() {
    }

    public EmployeeInformation(String name, String surname, char gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


}
