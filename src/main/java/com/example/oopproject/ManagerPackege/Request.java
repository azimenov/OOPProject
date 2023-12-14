package com.example.oopproject.ManagerPackege;

class Request extends Message {
	
    private boolean executed;
    private String requestDetails; 
    
   

	public boolean getExecuted() {
		return executed;
	}

	public void setExecuted(boolean executed) {
		this.executed = executed;
	}

	public String getRequestDetails() {
		return requestDetails;
	}

	public void setRequestDetails(String requestDetails) {
		this.requestDetails = requestDetails;
	}
	
 
}
