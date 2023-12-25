package com.example.oopproject.ReearcherPackage.model;

import com.example.oopproject.ReearcherPackage.ResearchPaper;
import com.example.oopproject.UserPackage.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

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
    public void printPapers(Comparator<ResearchPaper> comparator) {
        List<ResearchPaper> sortedPapers = new ArrayList<>(publications);
        sortedPapers.sort(comparator);

        for (ResearchPaper paper : sortedPapers) {
            System.out.println(paper.getTitle());
        }
    }

  
    public int calculateHIndex() {
        int hIndex = 0;
        for (ResearchPaper paper : publications) {
            int citations = paper.getCitations();
            if (citations >= hIndex + 1) {
                hIndex++;
            }
        }
        return hIndex;
    }
}

   
