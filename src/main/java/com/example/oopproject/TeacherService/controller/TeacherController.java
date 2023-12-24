package com.example.oopproject.TeacherService.controller;

import com.example.oopproject.CourseService.ActivatedCourses;
import com.example.oopproject.CourseService.Group;
import com.example.oopproject.EmployeeService.controller.EmployeeController;
import com.example.oopproject.EmployeeService.repository.EmployeeRepositoryImpl;
import com.example.oopproject.StudentService.model.Student;
import com.example.oopproject.TeacherService.Teacher;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TeacherController extends EmployeeController {
    public TeacherController(EmployeeRepositoryImpl repository) {
        super(repository);
    }
    public List<Student> getStudentsFromGroup(Teacher teacher, String courseName){
        return teacher.getGroups().stream().filter(group -> group.getCourse().getName().equals(courseName)).findFirst().get().getStudents();
    }
    public void assignCourse(Teacher teacher, Group group){
        teacher.addGroup(group);
    }
    public Set<String> getAllCourses(Teacher teacher){
        Set<String> result = new HashSet<>();
        for(Group group: teacher.getGroups()){
            result.add(group.getCourse().getName());
        }
        return result;
    }
}
