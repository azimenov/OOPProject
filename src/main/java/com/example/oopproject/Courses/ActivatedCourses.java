package com.example.oopproject.Courses;

import com.example.oopproject.TeacherPackage.Teacher;
import com.example.oopproject.student.Course;
import com.example.oopproject.student.Student;

import java.util.Vector;

public class ActivatedCourses {
    private int id;
    private Course course;
    private Teacher lecturer;
    private Teacher tutor;
    private Vector<Student> students;

    public ActivatedCourses(Course course, int id){
        students = new Vector<>();
        this.id = id;
        this.course = course;
    }
    public ActivatedCourses(int id, Course course, Teacher lecturer, Teacher tutor, Vector<Student> students) {
        this.id = id;
        this.course = course;
        this.lecturer = lecturer;
        this.tutor = tutor;
        this.students = students;
    }
    public void addStudent(Student student){
        students.add(student);
        student.addCourse(this);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Teacher getLecturer() {
        return lecturer;
    }

    public void setLecturer(Teacher lecturer) {
        this.lecturer = lecturer;
    }

    public Teacher getTutor() {
        return tutor;
    }

    public void setTutor(Teacher tutor) {
        this.tutor = tutor;
    }

    public Vector<Student> getStudents() {
        return students;
    }

    public void setStudents(Vector<Student> students) {
        this.students = students;
    }
}
