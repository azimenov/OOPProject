package com.example.oopproject.ReearcherPackage.model;

import com.example.oopproject.ReearcherPackage.model.Format;


class ResearchPaper {
    private String title;
    private String theme;
    private String fieldOfStudy;
    private String publisher;
    private Format textType;
    private int citations;

    public ResearchPaper(String title, String theme, String fieldOfStudy, String publisher, Format textType, int citations) {
        this.title = title;
        this.theme = theme;
        this.fieldOfStudy = fieldOfStudy;
        this.publisher = publisher;
        this.textType = textType;
        this.citations = citations;
    }

  public String getCitation(Format format) {
        if (format == Format.PLAIN_TEX) {
            return "Plain Text Citation";
        } else if (format == Format.BIBTEX) {
            return "BibTeX Citation";
        } else {
            return "Invalid Format";
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Format getTextType() {
        return textType;
    }

    public void setTextType(Format textType) {
        this.textType = textType;
    }

    public int getCitations() {
        return citations;
    }

    public void setCitations(int citations) {
        this.citations = citations;
    }
}
