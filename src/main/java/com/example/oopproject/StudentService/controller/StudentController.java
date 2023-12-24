package com.example.oopproject.StudentService.controller;

import com.example.oopproject.CourseService.ActivatedCourses;
import com.example.oopproject.StudentService.model.Student;
import com.example.oopproject.StudentService.repository.StudentRepositoryImpl;

import java.util.Vector;

public class StudentController {
    private final StudentRepositoryImpl studentRepository;
    private final Student student;
    public StudentController(StudentRepositoryImpl studentRepository, Student student){
        this.studentRepository = studentRepository;
        this.student = student;
    }


  
    public List<Group> getGroupsFromCourse(Student student, String courseName) {
        return student.getGroups().stream().filter(group -> group.getCourse().getName().equals(courseName)).toList();
    }

    public class StudentController {
    public Set<String> getAllCourses(Student student) {
        Set<String> result = new HashSet<>();
        for (Group group : student.getGroups()) {
            result.add(group.getCourse().getName());
        }
        return result;
    }

    }
