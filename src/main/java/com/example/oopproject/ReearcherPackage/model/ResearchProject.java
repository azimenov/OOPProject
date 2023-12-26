package com.example.oopproject.ReearcherPackage.model;

import com.example.oopproject.ReearcherPackage.model.Researcher;

import java.util.ArrayList;
import java.util.List;

// Class representing a research project
public class ResearchProject {
    private String title; // Title of the research project
    private List<Researcher> members; // List of researchers participating in the project

    // Constructor to initialize a ResearchProject object with a title
    public ResearchProject(String title) {
        this.title = title;
        this.members = new ArrayList<>(); // Initialize the list of members as an ArrayList
    }

    /**
     * Getter for the title of the research project
     * @return The title of the research project
     */
    public String getTitle() {
        return title;
    }

    /**
     * Method to add a member (Researcher) to the research project
     * @param researcher The Researcher to add to the project
     */
    public void addMember(Researcher researcher) {
        members.add(researcher);
    }

    /**
     * Getter for the list of members in the research project
     * @return The list of researchers participating in the project
     */
    public List<Researcher> getMembers() {
        return members;
    }

    /**
     * Method to add multiple members (Researcher) to the research project
     * @param newMembers The list of new members to add to the project
     * @throws InvalidMemberException If a non-Researcher object is attempting to join the project
     */
    public void addMembers(List<Researcher> newMembers) throws InvalidMemberException {
        for (Researcher member : newMembers) {
            if (!(member instanceof Researcher)) {
                throw new InvalidMemberException("Only researchers can join the research project.");
            }
        }
        members.addAll(newMembers);
    }

    // Inner class representing an exception specific to invalid members joining the project
    class InvalidMemberException extends Exception {
        public InvalidMemberException(String message) {
            super(message);
        }
    }
}
