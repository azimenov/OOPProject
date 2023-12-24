package com.example.oopproject.CourseService;

import com.example.oopproject.StudentService.model.Student;
import com.example.oopproject.TeacherService.Teacher;

import java.util.Vector;

public class Group {
    private Teacher teacher;
    private Vector<Student> students;
    private Course course;

    public Group(Teacher teacher, Vector<Student> students, Course course) {
        this.teacher = teacher;
        this.students = students;
        this.course = course;
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Vector<Student> getStudents() {
        return students;
    }

    public void setStudents(Vector<Student> students) {
        this.students = students;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
