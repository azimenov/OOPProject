package com.example.oopproject.TeacherPackage;

import java.util.ArrayList;
import java.util.List;

import student.Course;
import student.GradeLetter;
import student.Student;

public abstract class Teacher extends Employee {

    private TeacherType teacherType;
    private List<Course> coursesTeaching;

    public Teacher(TeacherType teacherType) {
        this.teacherType = teacherType;
        this.coursesTeaching = new ArrayList<>();
    }

    public TeacherType getTeacherType() {
        return teacherType;
    }

    public void setTeacherType(TeacherType teacherType) {
        this.teacherType = teacherType;
    }

    public List<Course> getCoursesTeaching() {
        return coursesTeaching;
    }

    public void addCourseToTeach(Course course) {
        coursesTeaching.add(course);
    }

    public void putMark(Student student, Course course, double mark) {
        // Logic to assign a mark to a student for a particular course
        student.addMark(course, mark);
    }

    public void putAttendance(Student student, Course course, boolean present) {
        // Logic to mark student attendance for a particular course
        student.markAttendance(course, present);
    }

    public void viewCourses() {
        // Displaying courses being taught by this teacher
        for (Course course : coursesTeaching) {
            System.out.println("Teaching: " + course.getName());
        }
    }

    public void uploadFiles() {
        // Logic to upload files
        // Implementation here
    }

    public void sendComplainToDean() {
        // Logic to send a complaint to the dean
        // Implementation here
    }

    public void viewTeacherSchedules() {
        // Logic to view teacher's schedules
        // Implementation here
    }

    // Additional methods or overrides can be added here as needed
}
