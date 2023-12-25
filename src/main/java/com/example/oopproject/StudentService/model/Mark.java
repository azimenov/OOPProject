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

    public Mark(String courseName, GradeLetter grade, double attestation1, double attestation2, double finalExam, Semester semester) {
        this.courseName = courseName;
        this.grade = grade;
        this.attestation1 = attestation1;
        this.attestation2 = attestation2;
        this.finalExam = finalExam;
        this.semester = semester;
    }

    // Getters and setters for grade, attestation1, attestation2, finalExam, and semester
    public GradeLetter getGrade() {
        return grade;
    }

    public void setGrade(GradeLetter grade) {
        this.grade = grade;
    }

    public double getAttestation1() {
        return attestation1;
    }

    public void setAttestation1(double attestation1) {
        this.attestation1 = attestation1;
    }

    public double getAttestation2() {
        return attestation2;
    }

    public void setAttestation2(double attestation2) {
        this.attestation2 = attestation2;
    }

    public double getFinalExam() {
        return finalExam;
    }

    public void setFinalExam(double finalExam) {
        this.finalExam = finalExam;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
