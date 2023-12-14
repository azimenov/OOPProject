package com.example.oopproject.TeacherPackage;

import com.example.oopproject.student.Course;
import com.example.oopproject.student.Student;

public class Dean extends Teacher {
    private EducationDirection educationDirection;
    public Dean(TeacherType teacherType, EducationDirection educationDirection) {
        super(teacherType);
        this.educationDirection = educationDirection;
    }

    public void getComplaints() {

    }

    public void viewOfEducationDirection() {
        if (educationDirection != null) {
            System.out.println("Education Direction:");
            System.out.println("Name: " + educationDirection.getName());
            System.out.println("Studies: " + educationDirection.getStudies());
            System.out.println("Program: " + educationDirection.getProgram());
        } else {
            System.out.println("No education direction available.");
        }
    }


    @Override
    public void putMark(Student student, Course course, double mark) {

    }

    @Override
    public void putAttendance(Student student, Course course, boolean present) {

    }

    @Override
    public void viewCourses() {

    }

    @Override
    public void viewTeacherSchedules() {

    }

}
