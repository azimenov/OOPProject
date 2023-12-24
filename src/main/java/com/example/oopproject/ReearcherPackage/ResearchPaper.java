package com.example.oopproject.ReearcherPackage;

import java.util.ArrayList;
import java.util.List;


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
        if (format == Format.PLAIN_TEXT) {
            return "Plain Text Citation";
        } else if (format == Format.BIBTEX) {
            return "BibTeX Citation";
        } else {
            return "Invalid Format";
        }
    }
}
