package com.example.oopproject.EmployeeService.repository;

import com.example.oopproject.EmployeeService.model.Employee;
import com.example.oopproject.EmployeeService.repository.EmployeeRepository;
import com.example.oopproject.db.DataBase;

import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    protected DataBase dataBase;
    public EmployeeRepositoryImpl(DataBase dataBase){
        this.dataBase = dataBase;
    }
    @Override
    public Employee findEmployeeByEmail(String email) {
        return dataBase.getEmployeeDatabase().stream().filter(employee -> employee.getEmail().equals(email)).findFirst().orElse(null);
    }

    @Override
    public Employee findEmployeeById(String id) {
        return dataBase.getEmployeeDatabase().stream().filter(employee -> employee.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public void addEmployee(Employee employee) {
        dataBase.getEmployeeDatabase().add(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return dataBase.getEmployeeDatabase().stream().toList();
    }
}
