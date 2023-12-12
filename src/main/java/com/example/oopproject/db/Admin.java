package com.example.oopproject.db;

import com.example.oopproject.UserPackage.User;
import javafx.scene.chart.PieChart;

public class Admin {
    private final DataBase dataBase;
    public Admin(DataBase dataBase) {
        this.dataBase = dataBase;
    }
    public void addUser(User user){
        dataBase.addUser(user);
    }
    public User sendRequest(String email, String password){
        return dataBase.isExists(email, password);
    }
}
