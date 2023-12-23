package com.example.oopproject.db;

import com.example.oopproject.UserPackage.User;
import com.example.oopproject.CourseService.Course;

import java.io.Serializable;
import java.util.Vector;

public class Admin implements Serializable {
    private DataBase db;

    public DataBase getDB(){
        return db;
    }
    public Admin(DataBase db){
        this.db = db;
    }
    public Vector<User> userLogIn(String email, String password){
        return db.userLogIn(email, password);
    }

}
