package com.example.oopproject.db;

import com.example.oopproject.Employee.Employee;
import com.example.oopproject.UserPackage.User;
import com.example.oopproject.student.Course;
import com.example.oopproject.student.Student;

import java.io.Serializable;
import java.util.Vector;

public class Admin implements Serializable {
    private DataBase db;

    public DataBase getDB(){
        return db;
    }
    public Admin(){
        db = new DataBase();
    }
    public void addCourse(Course course){
        db.addCourse(course);
    }
    public User userLogIn(String email, String password){
        return db.userLogIn(email, password);
    }
    public void addUser(User user){
        db.addUser(user);
    }

    public void deleteUser(User user){
        db.deleteUser(user);
    }

    public void displayAllUsers(){
        db.displayAllUsers();
    }

}
