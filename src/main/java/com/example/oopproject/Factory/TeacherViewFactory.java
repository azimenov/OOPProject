package com.example.oopproject.Factory;

import com.example.oopproject.TeacherService.Teacher;
import com.example.oopproject.TeacherService.controller.TeacherController;
import com.example.oopproject.TeacherService.view.TeacherViewEn;
import com.example.oopproject.TeacherService.view.TeacherViewKz;
import com.example.oopproject.TeacherService.view.TeacherViewRu;

/**
 * Factory class to create TeacherView based on language options.
 */
public class TeacherViewFactory {

    /**
     * Returns a TeacherView based on the provided option.
     * @param option The option to select the TeacherView language.
     * @param teacher The Teacher instance.
     * @param teacherController The TeacherController instance.
     * @return The appropriate TeacherView based on the option provided.
     */
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
