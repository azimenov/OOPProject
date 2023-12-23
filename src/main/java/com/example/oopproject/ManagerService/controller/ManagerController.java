package com.example.oopproject.ManagerService.controller;

import com.example.oopproject.EmployeeService.model.Employee;
import com.example.oopproject.EmployeeService.controller.EmployeeController;
import com.example.oopproject.EmployeeService.repository.EmployeeRepositoryImpl;
import com.example.oopproject.ManagerService.model.Manager;
import com.example.oopproject.StudentService.model.Student;
import com.example.oopproject.StudentService.repository.StudentRepositoryImpl;
import com.example.oopproject.TeacherService.Teacher;

public class ManagerController extends EmployeeController {
    protected StudentRepositoryImpl studentRepository;
    protected Manager manager;
    public ManagerController(EmployeeRepositoryImpl repository) {
        super(repository);
    }

    public ManagerController(EmployeeRepositoryImpl repository, Employee employee) {
        this(repository);
        manager = (Manager) employee;
    }
    public ManagerController(StudentRepositoryImpl studentRepository, EmployeeRepositoryImpl repository, Employee employee){
        this(repository, employee);
        this.studentRepository = studentRepository;
    }
    public void getTeacherInfo(Teacher teacher) {
        System.out.println("Getting teacher information: " + teacher);
        // Дополнительная логика, если необходимо
    }

    public void getStudentInfo(Student student) {
        String studentInfo = student.toString();
        System.out.println("Getting student information:"+ studentInfo);
    }

    public void getReport() {
        // Логика создания статистического отчета по успеваемости
        // ...
        System.out.println("Generating report...");
    }

}
