package com.example.oopproject.db;

import com.example.oopproject.Courses.ActivatedCourses;
import com.example.oopproject.Employee.Employee;
import com.example.oopproject.TeacherPackage.Teacher;
import com.example.oopproject.UserPackage.User;
import com.example.oopproject.student.Course;
import com.example.oopproject.student.Student;

import java.io.Serializable;
import java.util.Vector;

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
    public Course findCourseByCode(String id){
        if(enrolledCourses == null){
            enrolledCourses = new Vector<>();
        }
        return courses.stream().filter(course->course.getCourseId().equals(id)).findFirst().orElse(null);
    }
    public void addCourse(Course course){
        if(enrolledCourses == null){
            enrolledCourses = new Vector<>();
        }
        courses.add(course);
    }
    public void addCourse(ActivatedCourses course){
        if(enrolledCourses == null){
            enrolledCourses = new Vector<>();
        }
        enrolledCourses.add(course);
    }
    public Teacher findTeacherByEmail(String email){
        if(enrolledCourses == null){
            enrolledCourses = new Vector<>();
        }
        return (Teacher) usersDatabase.stream().filter(student  -> student.getEmail().equals(email)).findFirst().orElse(null);

    }
    public Employee findEmployeeByEmail(String email){
        return employeeDatabase.stream().filter(employee -> employee.getEmail().equals(email)).findFirst().orElse(null);
    }
    public Student findStudentByEmail(String email){
        return (Student) usersDatabase.stream().filter(student -> student.getEmail().equals(email)).findFirst().orElse(null);
    }
    public ActivatedCourses findByCode(int code){
        return enrolledCourses.stream()
                .filter(course -> course.getId() == code)
                .findFirst()
                .orElse(null);
    }
    public User userLogIn(String email, String password){
        return usersDatabase.stream()
                .filter(user -> user.getEmail().equals(email) && user.getPassword().equals(password))
                .findFirst()
                .orElse(null);

    }
    public void addUser(User user){
        usersDatabase.add(user);
        if(user instanceof Student){
            studentDatabase.add((Student) user);
        }
        if(user instanceof Employee){
            employeeDatabase.add((Employee) user);
        }
    }

    public void deleteUser(User user){
        usersDatabase.remove(user);
        if(user instanceof Student){
            studentDatabase.remove((Student) user);
        }
        if(user instanceof Employee){
            employeeDatabase.remove((Employee) user);
        }
    }

    public void displayAllUsers(){
        for(User i: usersDatabase){
            System.out.println(i);
        }
    }

}
