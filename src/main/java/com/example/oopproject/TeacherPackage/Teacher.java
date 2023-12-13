package com.example.oopproject.TeacherPackage;

public abstract class Teacher extends Employee{
    private TeacherType teacherType;

    public Teacher(TeacherType teacherType) {
        this.teacherType = teacherType;
    }

    public TeacherType getTeacherType() {
        return teacherType;
    }

    public void setTeacherType(TeacherType teacherType) {
        this.teacherType = teacherType;
    }

    public void putMark() {
        //TODO
        return null;
    }

    public void putAttendence() {
        //TODO
        return null;
    }

    public void viewCourses(Course course){
        return course;
    }

    public void uploadFiles(){}

    public void sendComplainToDean(){}
    public void viewTeacherSchedules() {
        //TODO
        return null;
    }
}
