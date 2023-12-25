package com.example.oopproject.AdminService.repository;

import com.example.oopproject.EmployeeService.model.Employee;
import com.example.oopproject.StudentService.model.Student;
import com.example.oopproject.TeacherService.Teacher;
import com.example.oopproject.UserPackage.User;
import com.example.oopproject.db.DataBase;

public class AdminRepositoryImpl implements AdminRepository {
    private DataBase dataBase;

    public AdminRepositoryImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void addUser(User user) {

        dataBase.getUsersDatabase().add(user);
    }

    @Override
    public void deleteUser(User user) {
        dataBase.getUsersDatabase().remove(user);
        if(user instanceof Student) dataBase.getStudentDatabase().add((Student) user);
        if(user instanceof Employee) dataBase.getEmployeeDatabase().add((Employee) user);
    }

    @Override
    public void updateUser(User user) {

    }
}
