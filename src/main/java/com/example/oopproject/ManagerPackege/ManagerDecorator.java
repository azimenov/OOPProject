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
 
	
	 public void getTeacherInfo() {
	}
	 public void getStudentInfo() {
	}
	 public void getReport() {
	}
	 public void getStudentsRequests() {
	}
	 public void getStudentFinanceInfo() {
	}
	 public void manageNews() {
	}

	
    
    
}
