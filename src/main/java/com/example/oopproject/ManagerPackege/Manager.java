package manager;

import java.util.List;
import java.util.Vector;

public class Manager {
	private Vector<Manager> listManager;
	private List<Message> requests;
	
	
	public Vector<Manager> getListManager() {
		return listManager;
	}
	
	public void setListManager(Vector<Manager> listManager) {
		this.listManager = listManager;
	}
	
	public List<Message> getRequests() {
		return requests;
	}
	
	public void setRequests(List<Message> requests) {
		this.requests = requests;
	}
	
	
		

	public void getTeacherInfo() {
        // Логика получения информации о преподавателях
        // ...
        System.out.println("Getting teacher information...");
    }

    public void getStudentInfo() {
        // Логика получения информации о студентах
        // ...
        System.out.println("Getting student information...");
    }

    public void getReport() {
        // Логика создания статистического отчета по успеваемости
        // ...
        System.out.println("Generating report...");
    }

    public void getStudentsRequests() {
        // Логика получения запросов от студентов
        // ...
        System.out.println("Getting students' requests...");
    }

    public void getStudentFinanceInfo() {
        // Логика получения финансовой информации студента
        // ...
        System.out.println("Getting student finance information...");
    }

    public void manageNews() {
        // Логика управления новостями
        // ...
        System.out.println("Managing news...");
    }

}
