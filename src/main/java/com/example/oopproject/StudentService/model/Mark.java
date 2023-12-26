package com.example.oopproject.StudentService.model;

import com.example.oopproject.StudentService.enums.GradeLetter;
import com.example.oopproject.StudentService.enums.Semester;

public class Mark {
    private GradeLetter grade; // Enum representing grade
    private String courseName;
    private double attestation1;
    private double attestation2;
    private double finalExam;
    private Semester semester; // Enum representing semester

    // Constructor to initialize a Mark object
    public Mark(String courseName, double attestation1, double attestation2, double finalExam, Semester semester) {
        this.courseName = courseName;
        this.attestation1 = attestation1;
        this.attestation2 = attestation2;
        this.finalExam = finalExam;
        this.semester = semester;
    }

    // Getter for grade
    public GradeLetter getGrade() {
        return grade;
    }

    // Setter for grade
    public void setGrade(GradeLetter grade) {
        this.grade = grade;
    }

    // Getter for attestation1
    public double getAttestation1() {
        return attestation1;
    }

    // Setter for attestation1
    public void setAttestation1(double attestation1) {
        this.attestation1 = attestation1;
    }

    // Getter for attestation2
    public double getAttestation2() {
        return attestation2;
    }

    // Setter for attestation2
    public void setAttestation2(double attestation2) {
        this.attestation2 = attestation2;
    }

    // Getter for finalExam
    public double getFinalExam() {
        return finalExam;
    }

    // Setter for finalExam
    public void setFinalExam(double finalExam) {
        this.finalExam = finalExam;
    }

    // Getter for semester
    public Semester getSemester() {
        return semester;
    }

    // Setter for semester
    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    // Getter for courseName
    public String getCourseName() {
        return courseName;
    }

    // Setter for courseName
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
