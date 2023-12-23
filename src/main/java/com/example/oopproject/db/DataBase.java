package com.example.oopproject.db;

import com.example.oopproject.CourseService.ActivatedCourses;
import com.example.oopproject.EmployeeService.model.Employee;
import com.example.oopproject.TeacherService.Teacher;
import com.example.oopproject.UserPackage.User;
import com.example.oopproject.CourseService.Course;
import com.example.oopproject.StudentService.model.Student;

import java.io.Serializable;
import java.util.Vector;
import java.util.stream.Collectors;

public class DataBase implements Serializable {
    private final Vector<User> usersDatabase;
    private final Vector<Student> studentDatabase;
    private final Vector<Employee> employeeDatabase ;
    private final Vector<Course> courses;
    private Vector<ActivatedCourses> enrolledCourses;
    public DataBase(){
        usersDatabase = new Vector<User>();
        studentDatabase = new Vector<Student>();
        employeeDatabase = new Vector<Employee>();
        courses = new Vector<Course>();
        enrolledCourses = new Vector<ActivatedCourses>();
    }
    public Vector<User> userLogIn(String email, String password){
        return usersDatabase.stream()
                .filter(user -> user.getEmail().equals(email) && user.getPassword().equals(password))
                .collect(Collectors.toCollection(Vector::new));

    }

    public Vector<User> getUsersDatabase() {
        return usersDatabase;
    }

    public Vector<Student> getStudentDatabase() {
        return studentDatabase;
    }

    public Vector<Employee> getEmployeeDatabase() {
        return employeeDatabase;
    }

    public Vector<Course> getCourses() {
        return courses;
    }

    public Vector<ActivatedCourses> getEnrolledCourses() {
        return enrolledCourses;
    }
}
