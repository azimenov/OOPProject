package com.example.oopproject.ManagerService.controller;

import com.example.oopproject.CourseService.ActivatedCourses;
import com.example.oopproject.CourseService.Group;
import com.example.oopproject.CourseService.repository.CourseRepositoryImpl;
import com.example.oopproject.EmployeeService.model.Employee;
import com.example.oopproject.EmployeeService.controller.EmployeeController;
import com.example.oopproject.EmployeeService.repository.EmployeeRepositoryImpl;
import com.example.oopproject.ManagerService.model.Manager;
import com.example.oopproject.StudentService.model.Student;
import com.example.oopproject.StudentService.repository.StudentRepositoryImpl;
import com.example.oopproject.TeacherService.Teacher;
import com.example.oopproject.TeacherService.repository.TeacherRepositoryImpl;

public class ManagerController extends EmployeeController {
    protected StudentRepositoryImpl studentRepository;
    protected CourseRepositoryImpl courseRepository;
    protected TeacherRepositoryImpl teacherRepository;

    public ManagerController(EmployeeRepositoryImpl repository) {
        super(repository);
    }

    public ManagerController(EmployeeRepositoryImpl repository, StudentRepositoryImpl studentRepository, CourseRepositoryImpl courseRepository, TeacherRepositoryImpl teacherRepository) {
        super(repository);
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
        this.teacherRepository = teacherRepository;
    }

    public void registerStudentForCourse(String email, Group group) {
        studentRepository.findStudentByEmail(email).addGroup(group);
    }

    public void assignCourseToTeacher(String email, Group group) {
        teacherRepository.findTeacherByEmail(email).addGroup(group);
    }
    public void activateCourse(ActivatedCourses activatedCourses){
        courseRepository.openCourse(activatedCourses);
    }
}
