package com.example.oopproject.TeacherPackage;

public class EducationDirection extends Teacher {

    private String name;
    private String studies;
    private String program;

    public EducationDirection(TeacherType teacherType, String name, String studies) {
        super(teacherType);
        this.name = name;
        this.studies = studies;
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

