package com.example.oopproject.TeacherService.controller;

import com.example.oopproject.CourseService.ActivatedCourses;
import com.example.oopproject.EmployeeService.controller.EmployeeController;
import com.example.oopproject.EmployeeService.repository.EmployeeRepositoryImpl;
import com.example.oopproject.TeacherService.Teacher;

public class TeacherController extends EmployeeController {
    protected Teacher teacher;
    public TeacherController(EmployeeRepositoryImpl repository, Teacher teacher) {
        super(repository);
        this.teacher = teacher;
    }
    public void assignCourse(ActivatedCourses course){
        teacher.getCourses().add(course);
    }
    public void viewCourses(){
        if(teacher.getCourses() == null){
            System.out.print("No courses registered");
        }
        for(ActivatedCourses activatedCourses : teacher.getCourses()){
            System.out.println(activatedCourses.getCourse().getName());
        }
    };
}
