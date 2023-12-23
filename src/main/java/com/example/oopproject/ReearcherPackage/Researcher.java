package com.example.oopproject.ReearcherPackage;

import com.example.oopproject.UserPackage.User;

import java.util.ArrayList;
import java.util.List;

class Researcher extends User {
    private String name;
    private ResearchProject project;
    private List<ResearchPaper> publications;

    public Researcher(String name) {
        super();
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

    public void publish(ResearchPaper researchPaper) {
        publications.add(researchPaper);
    }

    public void delete(ResearchPaper researchPaper) {
        publications.remove(researchPaper);
    }

    @Override
    public void getView() {

    }
}