package student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Course { 
 private String name;
 private String courseId;
 private int credits;
 private List<String> files;
 private Map<String, Boolean> attendance;
 private GradeLetter grade;
 private double attestation1;
 private double attestation2;
 private double finalExam;

 // Constructor
 public Course(String name, String courseId, int credits) {
     this.name = name;
     this.courseId = courseId;
     this.credits = credits;
     files = new ArrayList<>();
     attendance = new HashMap<>();
     grade = null;
     attestation1 = 0.0;
     attestation2 = 0.0;
     finalExam = 0.0;
 }

 
 
 public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public String getCourseId() {
	return courseId;
}



public void setCourseId(String courseId) {
	this.courseId = courseId;
}



public int getCredits() {
	return credits;
}



public void setCredits(int credits) {
	this.credits = credits;
}



public List<String> getFiles() {
	return files;
}



public void setFiles(List<String> files) {
	this.files = files;
}



public Map<String, Boolean> getAttendance() {
	return attendance;
}



public void setAttendance(Map<String, Boolean> attendance) {
	this.attendance = attendance;
}



public double getAttestation1() {
	return attestation1;
}



public double getAttestation2() {
	return attestation2;
}



public double getFinalExam() {
	return finalExam;
}



public void addFile(String file) {
     files.add(file);
 }

 public void showFiles() {
     for (String file : files) {
         System.out.println(file);
     }
 }

 public void showAttendance() {
     for (Map.Entry<String, Boolean> entry : attendance.entrySet()) {
         System.out.println("Student: " + entry.getKey() + ", Present: " + entry.getValue());
     }
 }

 public GradeLetter getGrade() {
     return grade;
 }

 public void setGrade(GradeLetter grade) {
     this.grade = grade;
 }

 public void setAttestation1(double attestation1) {
     this.attestation1 = attestation1;
 }

 public void setAttestation2(double attestation2) {
     this.attestation2 = attestation2;
 }

 public void setFinalExam(double finalExam) {
     this.finalExam = finalExam;
 }


 public void calculateFinalGrade() {
     
 }
}
