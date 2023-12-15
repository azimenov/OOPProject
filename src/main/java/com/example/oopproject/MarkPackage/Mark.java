package com.example.oopproject.MarkPackage;
import com.example.oopproject.student.enums.GradeLetter;
import com.example.oopproject.student.enums.Semester;
import com.example.oopproject.student.Student;
import com.example.oopproject.TeacherPackage.Teacher;

public class Mark {
    private GradeLetter grade; // Enum representing grade
    private double attestation1;
    private double attestation2;
    private double finalExam;
    private Semester semester; // Enum representing semester

    public Mark(GradeLetter grade, double attestation1, double attestation2, double finalExam, Semester semester) {
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
}
