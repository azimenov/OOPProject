package com.example.oopproject.Factory;

import com.example.oopproject.StudentService.Student;
import com.example.oopproject.StudentService.controller.StudentController;
import com.example.oopproject.StudentService.view.StudentViewEn;
import com.example.oopproject.StudentService.view.StudentViewKz;
import com.example.oopproject.StudentService.view.StudentViewRu;

/**
 * Factory class to create StudentView based on language options.
 */
public class StudentViewFactory {

    /**
     * Returns a StudentView based on the provided option.
     * @param option The option to select the StudentView language.
     * @param student The Student instance.
     * @param studentController The StudentController instance.
     * @return The appropriate StudentView based on the option provided.
     */
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

