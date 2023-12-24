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

     public void seeMessages(){
        for(Message message: manager.getMessages()){
            System.out.print(message);
            System.out.print("1: For answer\n2: Delete\n3: Answer later\n");
            int option = sc.nextInt();
            if(option == 1){
                sendMessage(message.getSender());
            }
            else if(option == 2){
                manager.getMessages().remove(message);
            }
        }
        System.out.print("There are no new messages\n");
    }

    public void viewSalary() {
        System.out.println("Your current salary is: " + manager.getSalary());
    }

    public void updateSalary() {
        System.out.print("Enter the new salary: ");
        int newSalary = sc.nextInt();
        manager.setSalary(newSalary);
        System.out.println("Salary updated successfully!");
    }

    public void viewRequests() {
        // Implement logic to view requests specific to the Manager
    }

    public void createNews() {
        System.out.println("Enter news content: ");
        String newsContent = sc.nextLine();
        News news = new News(newsContent, LocalDateTime.now());
        manager.setNewsManager(news);
        System.out.println("News created successfully!");
    }

    public void sendMessage() {
        System.out.print("Write email: ");
        String email = sc.next();
        sendMessage(email);
    }

    public void sendMessage(String email){
        System.out.println("Write theme");
        String theme = sc.next();
        System.out.print("Write message: ");
        String text = sc.next();
        Message message = new Message(theme, text, manager.getEmail(), false, LocalDateTime.now());
        repository.findEmployeeByEmail(email).getMessages().add(message);
    }

}
