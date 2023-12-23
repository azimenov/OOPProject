package com.example.oopproject.TeacherService.repository;

import com.example.oopproject.EmployeeService.model.Employee;
import com.example.oopproject.EmployeeService.repository.EmployeeRepositoryImpl;
import com.example.oopproject.TeacherService.Teacher;
import com.example.oopproject.UserPackage.enums.Role;
import com.example.oopproject.db.DataBase;

import java.util.List;

public class TeacherRepositoryImpl extends EmployeeRepositoryImpl implements TeacherRepository{
    public TeacherRepositoryImpl(DataBase dataBase) {
        super(dataBase);
    }

    @Override
    public Teacher findTeacherByEmail(String email) {
        return (Teacher) dataBase.getEmployeeDatabase().stream().filter(user -> user.getEmail().equals(email) && user.getRole() == Role.Teacher).findFirst().orElse(null);
    }

    @Override
    public Teacher findTeacherById(String id) {
        return (Teacher) dataBase.getEmployeeDatabase().stream().filter(user -> user.getId().equals(id) && user.getRole() == Role.Teacher).findFirst().orElse(null);
    }

    @Override
    public List<Employee> getAllTeachers() {
        return dataBase.getEmployeeDatabase().stream().filter(user->user.getRole() == Role.Teacher).toList();
    }

    @Override
    public void addTeacher(Teacher teacher) {
        super.addEmployee(teacher);
    }
}
