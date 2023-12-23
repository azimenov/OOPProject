package com.example.oopproject.TeacherService;

import com.example.oopproject.UserPackage.enums.FamilyStatus;
import com.example.oopproject.UserPackage.enums.Gender;
import com.example.oopproject.UserPackage.enums.Role;
import com.example.oopproject.db.DataBase;

public class EducationDirection extends Teacher {

    private String name;
    private String studies;
    private String program;

    public EducationDirection(String id, String password, String firstName, String lastName, String phoneNumber, Gender gender, FamilyStatus familyStatus, Role role, int salary, DataBase dataBase, TeacherType teacherType) {
        super(id, password, firstName, lastName, phoneNumber, gender, familyStatus, role, salary, dataBase, teacherType);
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudies() {
        return this.studies;
    }

    public void setStudies(String studies) {
        this.studies = studies;
    }

    public String getProgram() {
        return this.program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
}

