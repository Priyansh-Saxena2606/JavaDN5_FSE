package com.example.jpacrud.bean;

import jakarta.persistence.*;
import jakarta.websocket.ClientEndpoint;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int empid;

    @Column
    private String name;

    @Column(name="dept")
    private String department;

    @Column
    private String location;

    public Employee() {
    }

    public Employee(String name, String department, String location) {
        this.name = name;
        this.department = department;
        this.location = location;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
