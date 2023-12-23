package com.example.oopproject.TeacherService.repository;

import com.example.oopproject.EmployeeService.model.Employee;
import com.example.oopproject.EmployeeService.repository.EmployeeRepository;
import com.example.oopproject.TeacherService.Teacher;

import java.util.List;

public interface TeacherRepository extends EmployeeRepository {
    Teacher findTeacherByEmail(String email);
    Teacher findTeacherById(String id);
    List<Employee> getAllTeachers();
    void addTeacher(Teacher teacher);
}
