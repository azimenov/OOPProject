package com.example.oopproject.db;

import com.example.oopproject.UserPackage.User;

import java.io.Serializable;
import java.util.Vector;

public class DataBase implements Serializable {
    Vector<User> users;
    public DataBase(){
        users = new Vector<User>();
    }
    public void addUser(User user){
        users.add(user);
    }
    public User isExists(String email, String password) {
        return users.stream()
                .filter(user -> user.getEmail().equals(email) && user.getPassword().equals(password))
                .findFirst()
                .orElse(null);
    }
}
