package com.example.oopproject.CourseService;

import com.example.oopproject.StudentService.controller.StudentController;
import com.example.oopproject.TeacherService.Teacher;
import com.example.oopproject.CourseService.Course;
import com.example.oopproject.StudentService.model.Student;

import java.util.Vector;

public class ActivatedCourses {
    private int id;
    private Course course;
    private Teacher teacher;
    private Vector<Student> students;

    public ActivatedCourses(Course course, int id){
        students = new Vector<>();
        this.id = id;
        this.course = course;
    }
    public ActivatedCourses(int id, Course course, Teacher lecturer, Vector<Student> students) {
        this.id = id;
        this.course = course;
        this.teacher = lecturer;
        students.stream().forEach(this::addStudent);
    }
    public void addStudent(Student student){
        students.add(student);
        student.addCourse(this);
    }
    public void assignTeacher(Teacher teacher){
        this.teacher = teacher;
        teacher.addCourse(this);
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

    public Vector<Student> getStudents() {
        return students;
    }

    public void setStudents(Vector<Student> students) {
        this.students = students;
    }
}
