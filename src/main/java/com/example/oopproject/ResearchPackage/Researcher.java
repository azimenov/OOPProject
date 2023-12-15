package ResearcherPackage;
package com.example.oopproject.researcher;
import com.example.oopproject.UserPackage.User;
import com.example.oopproject.UserPackage.enums.FamilyStatus;
import com.example.oopproject.UserPackage.enums.Gender;
import com.example.oopproject.UserPackage.enums.Role;
import java.util.ArrayList;
import java.util.List;

class Researcher extends User{
    private String name;
    private ResearchProject project;
    private List<ResearchPaper> publications;

    public Researcher(String name) {
        this.name = name;
        this.project = new ResearchProject("Default Project");
        this.publications = new ArrayList<>();
    }

    public ResearchProject getProject() {
        return project;
    }

    public void setProject(ResearchProject project) {
        this.project = project;
    }

    public void publish(ResearchPaper) {
        publications.add(paper);
    }

    public void delete(ResearchPaper) {
        publications.remove(paper);
    }
}