package com.example.oopproject.ManagerPackege;

import com.example.oopproject.Employee.Employee;
import com.example.oopproject.TeacherPackage.Teacher;
import com.example.oopproject.UserPackage.enums.FamilyStatus;
import com.example.oopproject.UserPackage.enums.Gender;
import com.example.oopproject.UserPackage.enums.Role;
import com.example.oopproject.db.DataBase;
import com.example.oopproject.student.Student;

import java.util.List;

public class Manager extends Employee {
	protected List<Message> requests;
	protected News newsManager;

    public Manager(String id, String password, String firstName, String lastName, String phoneNumber, Gender gender, FamilyStatus familyStatus, Role role, int salary, DataBase dataBase) {
        super(id, password, firstName, lastName, phoneNumber, gender, familyStatus, role, salary, dataBase);
    }


    public List<Message> getRequests() {
		return requests;
	}
	
	public void setRequests(List<Message> requests) {
		this.requests = requests;
	}

	public void getTeacherInfo(Teacher teacher) {
        System.out.println("Getting teacher information: " + teacher);
        // Дополнительная логика, если необходимо
    }

    public void getStudentInfo(Student student) {
    	String studentInfo = student.toString();
    	System.out.println("Getting student information:"+ studentInfo);
    }

    public void getReport() {
        // Логика создания статистического отчета по успеваемости
        // ...
        System.out.println("Generating report...");
    }


    public void getStudentFinanceInfo(Student student) {
        String financeInfo = student.viewFinancialInfo();
        System.out.println("Getting student finance information:\n" + financeInfo);
    }

    public void manageNews(String news, boolean add) {
        if (add) {
            newsManager.addNews(news);
            System.out.println("News added: " + news);
        } else {
            newsManager.removeNews(news);
            System.out.println("News removed: " + news);
        }
    }

    public void displayAllNews() {
        List<String> allNews = newsManager.getNewsList();
        System.out.println("All News:");
        for (String news : allNews) {
            System.out.println(news);
        }
    }
    
    
    @Override
    public String toString() {
        return "Manager{" +
                ", requests=" + requests +
                ", newsManager=" + newsManager +
                '}';
    }
   

}
