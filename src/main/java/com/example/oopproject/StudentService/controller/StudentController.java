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

    // Constructor initializing StudentController with StudentRepositoryImpl
    public StudentController(StudentRepositoryImpl studentRepository){
        this.studentRepository = studentRepository;
    }

    // Retrieves groups from a course for a student
    public List<Group> getGroupsFromCourse(Student student, String courseName) {
        return student.getGroups().stream().filter(group -> group.getCourse().getName().equals(courseName)).toList();
    }

    // Retrieves all courses for a student
    public HashSet<String> getAllCourses(Student student) {
        HashSet<String> result = new HashSet<String>();
        for (Group group : student.getGroups()) {
            result.add(group.getCourse().getName());
        }
        return result;
    }

    // Views information about the teacher for a specific course of a student
    public String viewInfoAboutTeacher(Student student, String courseName){
        for(Group group: student.getGroups()){
            if(group.getCourse().getName().equals(courseName)){
                return group.getTeacher().toString();
            }
        }
        return null;
    }

    // Views marks of a student
    public Vector<Mark> viewMarks(Student student) {
        return student.getMarks();
    }

    // Setter for Title of Book
    public void setName(String name) {
        this.name = name;
    }
    
    // Getter for Availability of Book
    public boolean getIsAvailable() {
        return this.isAvailable;
    }
    
    // Setter for Availability of Book
    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
