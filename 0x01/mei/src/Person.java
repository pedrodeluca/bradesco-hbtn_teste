package com.techcamps.junit;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Person {

    private String name;
    private String surname;
    private Date birthDate;
    private boolean anotherCompanyOwner;
    private boolean pensioner;
    private boolean publicServer;
    private float salary;

    public String fullName() {
        return this.name + " " + this.surname;
    }

    public float calculateYearlySalary() {
        return this.salary * 12;
    }

    public boolean isMEI() {
        LocalDate formattedDate = this.birthDate.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();

        int age = Period.between(formattedDate, LocalDate.now()).getYears();

        return calculateYearlySalary() <= 130000 && age > 18 && !anotherCompanyOwner && !pensioner && !publicServer;
    }


    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
        this.anotherCompanyOwner = anotherCompanyOwner;
    }

    public void setPensioner(boolean pensioner) {
        this.pensioner = pensioner;
    }

    public void setPublicServer(boolean publicServer) {
        this.publicServer = publicServer;
    }
}
