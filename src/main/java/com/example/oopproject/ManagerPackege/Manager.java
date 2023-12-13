package manager;

import java.util.List;
import java.util.Vector;

public class Manager {
	private Vector<Manager> listManager;
	private List<Message> requests;
	private News newsManager;

    public Manager() {
        this.newsManager = new News();
    }
	
	
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
	
	
		

	public void getTeacherInfo(Teacher teacher) {
        String teacherInfo = teacher.getTeacherInformation();
        System.out.println("Getting teacher information: " + teacherInfo);
        // Дополнительная логика, если необходимо
    }

    public void getStudentInfo(Student student) {
    	String studentInfo = student.getStudentInfo();
    	System.out.println("Getting student information:"+ studentInfo);
    }

    public void getReport() {
        // Логика создания статистического отчета по успеваемости
        // ...
        System.out.println("Generating report...");
    }

    public void getStudentsRequests(Student student, Request request) {
        String studentRequestInfo = "Student: " + student.getName() + ", ID: " + student.getId() +
                                    "\nRequest Details: " + request.getRequestDetails();

        System.out.println("Getting students' requests:\n" + studentRequestInfo);
       
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

}
