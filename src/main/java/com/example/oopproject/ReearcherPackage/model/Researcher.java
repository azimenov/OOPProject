package com.example.oopproject.ReearcherPackage.model;

import com.example.oopproject.UserPackage.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

// Represents a researcher
public class Researcher extends User {
    private String name; // Name of the researcher
    private ResearchProject project; // Research project the researcher is associated with
    private List<ResearchPaper> publications; // List of publications authored by the researcher

    // Constructor initializing a Researcher object with a name
    public Researcher(String name) {
        super(); // Invoking the default constructor from the superclass User
        this.name = name;
        this.project = new ResearchProject("Default Project"); // Initialize a default project
        this.publications = new ArrayList<>(); // Initialize an empty list of publications
    }

    // Getter for the researcher's associated project
    public ResearchProject getProject() {
        return project;
    }

    // Setter for the researcher's associated project
    public void setProject(ResearchProject project) {
        this.project = project;
    }

    // Method for the researcher to publish a research paper
    public void publish(ResearchPaper researchPaper) {
        publications.add(researchPaper);
    }

    // Method for the researcher to delete a research paper from their publications
    public void delete(ResearchPaper researchPaper) {
        publications.remove(researchPaper);
    }

    // Method to print the researcher's papers sorted by a specified comparator
    public void printPapers(Comparator<ResearchPaper> comparator) {
        List<ResearchPaper> sortedPapers = new ArrayList<>(publications);
        sortedPapers.sort(comparator);

        for (ResearchPaper paper : sortedPapers) {
            System.out.println(paper.getTitle());
        }
    }

    // Method to calculate the H-index of the researcher based on their publications' citations
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

