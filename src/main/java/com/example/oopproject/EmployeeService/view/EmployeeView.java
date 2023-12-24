package com.example.oopproject.EmployeeService.view; 
 
import com.example.oopproject.EmployeeService.Employee; 
import com.example.oopproject.EmployeeService.controller.EmployeeController; 
 
public class EmployeeView { 
    protected Employee employee; 
    protected EmployeeController employeeController; 
 
    public EmployeeView(Employee employee, EmployeeController employeeController) { 
        this.employee = employee; 
        this.employeeController = employeeController; 
    } 
 
    public void getDefaultView() { 
        System.out.println("Welcome to the system"); 
        System.out.println("1. View Messages"); 
        System.out.println("2. View Salary"); 
        System.out.println("3. Update Salary"); 
    } 
}