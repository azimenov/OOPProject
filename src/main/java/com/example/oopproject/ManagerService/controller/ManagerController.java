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


    public ManagerController(EmployeeRepositoryImpl repository, StudentRepositoryImpl studentRepository, CourseRepositoryImpl courseRepository, TeacherRepositoryImpl teacherRepository) {
        super(repository);
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
        this.teacherRepository = teacherRepository;
    }

    public void registerStudentForCourse(String email, String courseName, int groupNumber) {
        courseRepository.findActivatedCourseByCourseName(courseName).getGroups().elementAt(groupNumber).addStudent(studentRepository.findStudentByEmail(email));
    }
    public void assignCourseToTeacher(String email, String courseName, int groupNumber) {
        courseRepository.findActivatedCourseByCourseName(courseName).assignTeacher(teacherRepository.findTeacherByEmail(email), groupNumber);


    }
    public void activateCourse(ActivatedCourses activatedCourses){
        courseRepository.openCourse(activatedCourses);
    }
}
