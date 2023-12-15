package com.example.oopproject.ResearchPaper;

import com.example.oopproject.ResearchPackage.enums.Format;

import java.util.ArrayList;
import java.util.List;


class ResearchPaper {
    private String title;
    private String theme;
    private String fieldOfStudy;
    private String publisher;
    private Format format; 

    public ResearchPaper(String title, String theme, String fieldOfStudy, String publisher) {
        this.title = title;
        this.theme = theme;
        this.fieldOfStudy = fieldOfStudy;
        this.publisher = publisher;
    }

    public void addLinks() {
        
    }

    public String getCitation() {
        
        return "";
    }
      public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }
}
