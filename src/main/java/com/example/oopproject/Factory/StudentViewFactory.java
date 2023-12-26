package com.example.oopproject.UserPackage;

import com.example.oopproject.StudentService.Student;
import com.example.oopproject.StudentService.controller.StudentController;
import com.example.oopproject.StudentService.view.StudentViewEn;
import com.example.oopproject.StudentService.view.StudentViewKz;
import com.example.oopproject.StudentService.view.StudentViewRu;

public class StudentViewFactory {

    public StudentView getView(int option, Student student, StudentController studentController){
        if(option == 1){
            return new StudentViewEn(student, studentController);
        }
        else if(option == 2){
            return new StudentViewKz(student, studentController);
        }
        else{
            return new StudentViewRu(student, studentController);
        }
    }
}
