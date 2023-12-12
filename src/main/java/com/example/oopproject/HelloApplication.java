package com.example.oopproject;

import com.example.oopproject.StudentPackage.Bachelor;
import com.example.oopproject.UserPackage.User;
import com.example.oopproject.db.Admin;
import com.example.oopproject.db.DataBase;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Admin admin = new Admin(new DataBase());
        admin.addUser(new Bachelor("dynastymm9@gmail.com", "qwerty"));
        admin.addUser(new Bachelor("azimenovm@gmail.com", "qwerty"));
        admin.addUser(new Bachelor("qwerty@gmail.com", "qwerty"));
        admin.addUser(new Bachelor("margulan@gmail.com", "qwerty"));


        System.out.println("Write email, and password");
        System.out.print("email:");
        Scanner sc = new Scanner(System.in);
        String email = sc.next();
        System.out.print("password:");
        String password = sc.next();

        User user = admin.sendRequest(email, password);
        while(user!=null){
            System.out.println(user instanceof Bachelor);
            System.out.println(user.getView());
            int option = sc.nextInt();

            if(option == 1){
                user = (Bachelor)user;
                System.out.print(((Bachelor) user).getSchedule());
            }
            else if(option == 2){
                user = null;
            }
        }
    }
}