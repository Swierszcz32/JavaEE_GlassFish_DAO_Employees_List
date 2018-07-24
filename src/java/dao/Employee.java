package dao;

import java.time.LocalDate;
import java.util.Date;

public class Employee {
    
    private String firstName;
    private String lastName;
    private double salary;
    private LocalDate data;
//    private String averageSalary;

    public Employee(String firstName, String lastName, double salary, LocalDate data) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.data = data;
//        this.averageSalary = averageSalary;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

//    public String getAverageSalary() {
//        return averageSalary;
//    }
//
//    public void setAverageSalary(String averageSalary) {
//        this.averageSalary = averageSalary;
//    }
}
