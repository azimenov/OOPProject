package com.example.oopproject.UserPackage;

import com.example.oopproject.TeacherService.Teacher;
import com.example.oopproject.TeacherService.controller.TeacherController;
import com.example.oopproject.TeacherService.view.TeacherViewEn;
import com.example.oopproject.TeacherService.view.TeacherViewKz;
import com.example.oopproject.TeacherService.view.TeacherViewRu;

public class TeacherViewFactory {

    public TeacherViewEn getView(int option, Teacher teacher, TeacherController teacherController){
        if(option == 1){
            return new TeacherViewEn(teacher, teacherController);
        }
        else if(option == 2){
            return new TeacherViewKz(teacher, teacherController);
        }
        else{
            return new TeacherViewRu(teacher, teacherController);
        }
    }
}
