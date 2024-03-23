package com.ironhack.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "patient")
public class Patient {
    @Id
    @Column(name="patient_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer patientId;

    @Column(name="name")
    private String name;

    private String dateOfBirth;
    @ManyToOne
    @JoinColumn(name = "admitted_by", referencedColumnName = "employee_id")
    private Employee admittedBy;

    public Patient(){}
    public Patient(String name, String dateOfBirth, Employee admittedBy, Integer patientId) {

        setName(name);
        setDateOfBirth(dateOfBirth);
        setAdmittedBy(admittedBy);
    }

    public Integer getPatientId() {
        return this.patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Employee getAdmittedBy() {
        return admittedBy;
    }

    public void setAdmittedBy(Employee admittedBy) {
        this.admittedBy = admittedBy;
    }
}