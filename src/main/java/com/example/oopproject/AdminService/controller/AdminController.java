package com.example.oopproject.AdminService.controller;

import com.example.oopproject.AdminService.repository.AdminRepository;
import com.example.oopproject.UserPackage.User;

public class AdminController {
    private AdminRepository adminRepository;

    public AdminController(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public void addUser(User user){
        adminRepository.addUser(user);
    }

    public void deleteUser(User user){
        adminRepository.deleteUser(user);
    }
}
