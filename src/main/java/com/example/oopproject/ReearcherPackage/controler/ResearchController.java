package com.example.oopproject.ResearcherPackage.controller;

import com.example.oopproject.ResearcherPackage.model.ResearchPaper;
import com.example.oopproject.ResearcherPackage.model.Researcher;

import java.util.Comparator;
import java.util.List;

public class ResearcherController {
    private final Researcher researcher;

    public ResearcherController(Researcher researcher) {
        this.researcher = researcher;
    }

    public void publishPaper(ResearchPaper researchPaper) {
        researcher.publish(researchPaper);
    }

    public void deletePaper(ResearchPaper researchPaper) {
        researcher.delete(researchPaper);
    }

    public void printSortedPapers(Comparator<ResearchPaper> comparator) {
        researcher.printPapers(comparator);
    }

    public int calculateHIndex() {
        return researcher.calculateHIndex();
    }
}
