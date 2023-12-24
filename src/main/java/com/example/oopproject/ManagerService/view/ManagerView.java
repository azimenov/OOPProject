package com.example.oopproject.ManagerService.view;

import com.example.oopproject.ManagerService.Manager;
import com.example.oopproject.ManagerService.controller.ManagerController;

public class ManagerView {
    protected Manager manager;
    protected ManagerController managerController;


    public ManagerView(Manager manager, ManagerController managerController) {
        this.manager = manager;
        this.managerController = managerController;
    }

    public void getDefaultView(){
        System.out.print("Welcome to system\n1. View Employees\n2. View Requests\n3. View News");
    }
}