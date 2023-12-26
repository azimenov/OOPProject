package com.example.oopproject.CourseService;

import com.example.oopproject.StudentService.model.Student;
import com.example.oopproject.TeacherService.Teacher;

import java.util.Vector;

public class Group {
    private Teacher teacher;
    private Vector<Student> students;
    private Course course;
    private int groupNumber;
    public Group(){
        students = new Vector<>();
    }
    public Group(Course course, int groupNumber){
        this.course = course;
        this.groupNumber = groupNumber;
        students = new Vector<Student>();

    }
    public Group(Teacher teacher, Vector<Student> students, Course course, int groupNumber) {
        this.students = students;
        this.teacher = teacher;
        this.course = course;
        this.groupNumber = groupNumber;
    }
    public void addStudent(Student student){
        students.add(student);
        student.addGroup(this);
    }
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
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

    public Vector<Student> getStudents() {
        return students;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }
}
