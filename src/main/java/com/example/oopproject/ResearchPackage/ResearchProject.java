package com.example.oopproject.ResearchProject;
package com.example.oopproject.ResearchPackage;
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
