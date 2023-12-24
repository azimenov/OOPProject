package com.example.oopproject.CourseService;

import com.example.oopproject.TeacherService.Teacher;
import com.example.oopproject.StudentService.model.Student;

import java.util.Vector;

public class ActivatedCourses {
    private Course course;
    private Vector<Group> groups;
    public void addStudent(Student student, int groupNumber){
        groups.elementAt(groupNumber).addStudent(student);
        student.addGroup(groups.elementAt(groupNumber));
    }
    public void assignTeacher(Teacher teacher, int groupNumber){
        groups.elementAt(groupNumber).setTeacher(teacher);
        teacher.addGroup(groups.elementAt(groupNumber));
    }
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
