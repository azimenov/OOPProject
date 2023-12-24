package com.example.oopproject.ManagerService.controller;

import com.example.oopproject.CourseService.ActivatedCourses;
import com.example.oopproject.CourseService.Group;
import com.example.oopproject.CourseService.repository.CourseRepositoryImpl;
import com.example.oopproject.EmployeeService.model.Employee;
import com.example.oopproject.EmployeeService.repository.EmployeeRepositoryImpl;
import com.example.oopproject.ManagerService.model.Manager;
import com.example.oopproject.StudentService.repository.StudentRepositoryImpl;
import com.example.oopproject.TeacherService.repository.TeacherRepositoryImpl;

public class SchoolManagerController extends ManagerController {

    public SchoolManagerController(EmployeeRepositoryImpl repository, Employee employee, StudentRepositoryImpl studentRepository, CourseRepositoryImpl courseRepository, TeacherRepositoryImpl teacherRepository, Manager manager) {
        super(repository, employee, studentRepository, courseRepository, teacherRepository, manager);
    }

    public void assignCourseToTeacher(String email, Group group) {
        teacherRepository.findTeacherByEmail(email).addGroup(group);
    }
    public void activateCourse(ActivatedCourses activatedCourses){
        courseRepository.openCourse(activatedCourses);
    }
}
