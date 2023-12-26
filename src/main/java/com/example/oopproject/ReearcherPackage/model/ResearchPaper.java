package com.example.oopproject.ReearcherPackage.model;

// Import the Format enum from the same package
import com.example.oopproject.ReearcherPackage.model.Format;

// Class representing a research paper
public class ResearchPaper {
    private String title; // Title of the research paper
    private String theme; // Theme or topic of the paper
    private String fieldOfStudy; // Field of study the paper belongs to
    private String publisher; // Publisher of the paper
    private Format textType; // Format of the paper's text (using the Format enum)
    private int citations; // Number of citations for the paper

    // Constructor to initialize a ResearchPaper object
    public ResearchPaper(String title, String theme, String fieldOfStudy, String publisher, Format textType, int citations) {
        this.title = title;
        this.theme = theme;
        this.fieldOfStudy = fieldOfStudy;
        this.publisher = publisher;
        this.textType = textType;
        this.citations = citations;
    }

    /**
     * Method to get the citation based on the format
     * @param format The format of the citation (PLAIN_TEX or BIBTEX)
     * @return The citation in the specified format
     */
    public String getCitation(Format format) {
        if (format == Format.PLAIN_TEX) {
            return "Plain Text Citation";
        } else if (format == Format.BIBTEX) {
            return "BibTeX Citation";
        } else {
            return "Invalid Format";
        }
    }

    // Getters and setters for the attributes of the ResearchPaper class

    /**
     * Getter for the title of the research paper
     * @return The title of the research paper
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter for the title of the research paper
     * @param title The title of the research paper to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter for the theme of the research paper
     * @return The theme of the research paper
     */
    public String getTheme() {
        return theme;
    }

    /**
     * Setter for the theme of the research paper
     * @param theme The theme of the research paper to set
     */
    public void setTheme(String theme) {
        this.theme = theme;
    }

    /**
     * Getter for the field of study of the research paper
     * @return The field of study of the research paper
     */
    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    /**
     * Setter for the field of study of the research paper
     * @param fieldOfStudy The field of study to set for the research paper
     */
    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    /**
     * Getter for the publisher of the research paper
     * @return The publisher of the research paper
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Setter for the publisher of the research paper
     * @param publisher The publisher of the research paper to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * Getter for the text type format of the research paper
     * @return The text type format of the research paper
     */
    public Format getTextType() {
        return textType;
    }

    /**
     * Setter for the text type format of the research paper
     * @param textType The text type format to set for the research paper
     */
    public void setTextType(Format textType) {
        this.textType = textType;
    }

    /**
     * Getter for the number of citations for the research paper
     * @return The number of citations for the research paper
     */
    public int getCitations() {
        return citations;
    }

    /**
     * Setter for the number of citations for the research paper
     * @param citations The number of citations to set for the research paper
     */
    public void setCitations(int citations) {
        this.citations = citations;
    }
}
