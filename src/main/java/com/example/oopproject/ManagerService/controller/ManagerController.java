package com.example.oopproject.ManagerService.controller;

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

    public ManagerController(EmployeeRepositoryImpl repository, StudentRepositoryImpl studentRepository, CourseRepositoryImpl courseRepository, TeacherRepositoryImpl teacherRepository, Manager manager) {
        super(repository);
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
        this.teacherRepository = teacherRepository;
        this.manager = manager;
    }

    public ManagerController(EmployeeRepositoryImpl repository, Employee employee, StudentRepositoryImpl studentRepository, CourseRepositoryImpl courseRepository, TeacherRepositoryImpl teacherRepository, Manager manager) {
        super(repository, employee);
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
        this.teacherRepository = teacherRepository;
        this.manager = manager;
    }

         public List<Message> getMessagesFromEmployees(Manager manager) {
        return ((Manager) employee).getMessages();
    }

    public void viewSalary(Manager manager) {
        System.out.println("Manager's salary: " + ((Manager) employee).getSalary());
    }

    public void updateSalary(Manager manager, int newSalary) {
        manager.setSalary(newSalary);
        System.out.println("Manager's salary updated to: " + newSalary);
    }

    public List<Message> viewRequests(Manager manager) {
      
        return manager.getRequests();
    }

    public void createNews(Manager manager, String newsContent) {
        News news = new News(newsContent, LocalDateTime.now());
        manager.setNewsManager(news);
        System.out.println("News created successfully!");
    }
}
