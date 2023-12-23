package com.example.oopproject.ManagerService.controller;

import com.example.oopproject.CourseService.ActivatedCourses;
import com.example.oopproject.CourseService.Course;
import com.example.oopproject.CourseService.repository.CourseRepositoryImpl;
import com.example.oopproject.EmployeeService.model.Employee;
import com.example.oopproject.EmployeeService.repository.EmployeeRepositoryImpl;
import com.example.oopproject.ManagerService.model.Manager;
import com.example.oopproject.StudentService.repository.StudentRepositoryImpl;
import com.example.oopproject.TeacherService.repository.TeacherRepositoryImpl;

import java.util.Scanner;

public class SchoolManagerController extends ManagerController {

    public SchoolManagerController(EmployeeRepositoryImpl repository, Employee employee, StudentRepositoryImpl studentRepository, CourseRepositoryImpl courseRepository, TeacherRepositoryImpl teacherRepository, Manager manager) {
        super(repository, employee, studentRepository, courseRepository, teacherRepository, manager);
    }

    public void assignCourseToTeacher(String email, String courseCode) {
        ActivatedCourses course = courseRepository.findActivatedCourseById(courseCode);
        course.setTeacher(teacherRepository.findTeacherByEmail(email));
    }
    public void activateCourse(String id){

    }
}
