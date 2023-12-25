package com.example.oopproject.AdminService.repository;

import com.example.oopproject.UserPackage.User;
import com.example.oopproject.db.DataBase;

public interface AdminRepository {

    public void addUser(User user);
    public void deleteUser(User user);
    public void updateUser(User user);
}
