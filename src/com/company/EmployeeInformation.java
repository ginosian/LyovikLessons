package com.company;

/**
 * Created by Martha on 25.02.15.
 */
public class EmployeeInformation {
    private String name;
    private String surname;
    private char gender;
    private int age;
    private double sallary;

    public EmployeeInformation() {
    }

    public EmployeeInformation(String name, String surname, char gender, int age, double sallary) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.sallary = sallary;
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

    public void employeeInit(String inputName, String inputSurname, char inputGender, int inputAge, double inputSallary){

        setName(inputName);
        setSurname(inputSurname);
        setGender(inputGender);
        setAge(inputAge);
        setSallary(inputSallary);
    }

    public void employeeInformationPrint(){
        System.out.println("Name" + "\t" + getName());
        System.out.println("Surname" + "\t" + getSurname());
        System.out.println("Gender" + "\t" + getGender());
        System.out.println("Age" + "\t" + getAge());
        System.out.println("Sallary" + "\t" + getSallary());
    }

}
