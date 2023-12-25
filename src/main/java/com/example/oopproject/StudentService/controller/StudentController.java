package com.example.oopproject.StudentService.controller;

import com.example.oopproject.CourseService.ActivatedCourses;
import com.example.oopproject.CourseService.Group;
import com.example.oopproject.StudentService.model.Mark;
import com.example.oopproject.StudentService.model.Student;
import com.example.oopproject.StudentService.repository.StudentRepositoryImpl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class StudentController {
    private final StudentRepositoryImpl studentRepository;
    public StudentController(StudentRepositoryImpl studentRepository){
        this.studentRepository = studentRepository;
    }

    public List<Group> getGroupsFromCourse(Student student, String courseName) {
        return student.getGroups().stream().filter(group -> group.getCourse().getName().equals(courseName)).toList();
    }


    public HashSet<String> getAllCourses(Student student) {
        HashSet<String> result = new HashSet<String>();
        for (Group group : student.getGroups()) {
            result.add(group.getCourse().getName());
        }
        return result;
    }

    public String viewInfoAboutTeacher(Student student, String courseName){
        for(Group group: student.getGroups()){
            if(group.getCourse().getName().equals(courseName)){
                return group.getTeacher().toString();
            }
        }
        return null;
    }

    public Vector<Mark> viewMarks(Student student) {
        return student.getMarks();
    }
}
