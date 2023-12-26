package com.example.oopproject.CourseService;

import com.example.oopproject.TeacherService.Teacher;
import com.example.oopproject.StudentService.model.Student;

import java.util.Vector;

public class  ActivatedCourses {
    private Course course;
    private Vector<Group> groups;
    private int groupNumber;

    public ActivatedCourses(Course course, int groupNumber) {
        this.course = course;
        groups = new Vector<>();
        for(int i = 1;i<=groupNumber;i++){
            groups.add(new Group( course, i));
        }
    }

    public void addStudent(Student student, int groupNumber){
        groups.stream().filter(group -> group.getGroupNumber() == groupNumber).findFirst().orElse(null).addStudent(student);
    }

    public Group getGroupByNumber(int num){
        return groups.elementAt(num);
    }
    public void assignTeacher(Teacher teacher, int groupNumber){
        groups.stream().filter(group -> group.getGroupNumber() == groupNumber).findFirst().orElse(null).setTeacher(teacher);
        teacher.addGroup(groups.stream().filter(group -> group.getGroupNumber() == groupNumber).findFirst().orElse(null));
    }
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Vector<Group> getGroups() {
        return groups;
    }

    public void setGroups(Vector<Group> groups) {
        this.groups = groups;
    }
}
