package manager;

import java.util.List;

import java.util.Vector;


public class ManagerDecorator extends Manager {
    

    private Manager manager;
    
    private List<Manager> listManager;
    
    
    

	public Manager getManager() {
        return this.manager;
    }
	
	public Vector<Manager> getListManager() {
		return (Vector<Manager>) listManager;
	}

	public void setListManager(List<Manager> listManager) {
		this.listManager = listManager;
	}
    
	
	 public ManagerDecorator() {
			super();
			// TODO Auto-generated constructor stub
		}
 
	
	 @Override
	    public void getTeacherInfo(Teacher teacher) {
	        super.getTeacherInfo(teacher);
	        
	    }

	    @Override
	    public void getStudentInfo(Student student) {
	        super.getStudentInfo(student);
	       
	    }

	    @Override
	    public void getReport() {
	        super.getReport();
	        
	    }

	    @Override
	    public void getStudentsRequests(Student student, Request request) {
	        super.getStudentsRequests(student, request);
	       
	    }

	    @Override
	    public void getStudentFinanceInfo(Student student) {
	        super.getStudentFinanceInfo(student);
	       
	    }

	    @Override
	    public void manageNews(String news, boolean add) {
	        super.manageNews(news, add);
	       
	    }

	    @Override
	    public void displayAllNews() {
	        super.displayAllNews();
	        
	    }
	 public String toString() {
	        return "ManagerDecorator{" +
	                "manager=" + manager +
	                ", listManager=" + listManager +
	                '}';
	    }

	
    
    
}
