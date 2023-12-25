package com.example.oopproject.ReearcherPackage.model;

import com.example.oopproject.ReearcherPackage.model.Researcher;

import java.util.ArrayList;
import java.util.List;

public class ResearchProject {
    private String title;
    private List<Researcher> members;

    public ResearchProject(String title) {
        this.title = title;
        this.members = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void addMember(Researcher researcher) {
        members.add(researcher);
    }

    public List<Researcher> getMembers() {
        return members;
    }


    public void addMembers(List<Researcher> newMembers) throws InvalidMemberException {
        for (Researcher member : newMembers) {
            if (!(member instanceof Researcher)) {
                throw new InvalidMemberException("Only researchers can join the research project.");
            }
        }
        members.addAll(newMembers);
    }


    class InvalidMemberException extends Exception {
        public InvalidMemberException(String message) {
            super(message);
        }
    }
}
