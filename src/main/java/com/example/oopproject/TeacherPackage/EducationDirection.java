package com.example.oopproject.TeacherPackage;

public class EducationDirection extends Teacher{
    private String name;

    private String studies;

    private  programm;

    public EducationDirection(TeacherType teacherType,String name, String studies) {
        super(teacherType);
        this.name = name;
        this.studies = studies;
    }

    public String getName() {
        return this.name;
    }

    public String setName(String name) {
        this.name = name;
    }


    public String getStudies() {
        return this.studies;
    }

    public String setStudies(String studies) {
        this.studies = studies;
    }

    public  getProgramm() {
        return this.programm;
    }

    public  setProgramm(invalid programm) {
        this.programm = programm;
    }
}
