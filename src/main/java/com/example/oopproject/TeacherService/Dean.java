package com.example.oopproject.TeacherService;

import com.example.oopproject.UserPackage.enums.FamilyStatus;
import com.example.oopproject.UserPackage.enums.Gender;
import com.example.oopproject.UserPackage.enums.Role;
import com.example.oopproject.db.DataBase;
import com.example.oopproject.CourseService.Course;
import com.example.oopproject.StudentService.model.Student;

public class Dean extends Teacher {
    private EducationDirection educationDirection;

    public Dean(String id, String password, String firstName, String lastName, String phoneNumber, Gender gender, FamilyStatus familyStatus, Role role, int salary, DataBase dataBase, TeacherType teacherType) {
        super(id, password, firstName, lastName, phoneNumber, gender, familyStatus, role, salary, dataBase, teacherType);
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


    public void putMark(Student student, Course course, double mark) {

    }

    public void putAttendance(Student student, Course course, boolean present) {

    }

    public void viewCourses() {

    }

    public void viewTeacherSchedules() {

    }

}
