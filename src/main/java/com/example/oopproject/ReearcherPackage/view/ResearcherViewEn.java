package com.example.oopproject.ResearcherPackage.view;

import com.example.oopproject.ResearcherPackage.controller.ResearcherController;
import com.example.oopproject.ResearcherPackage.model.ResearchPaper;
import com.example.oopproject.ResearcherPackage.model.Researcher;

import java.util.Comparator;
import java.util.Scanner;

public class ResearcherViewEn {
    private final ResearcherController researcherController;
    private final Scanner scanner;
    private Researcher researcher;

    public ResearcherViewEn(ResearcherController researcherController, Researcher researcher) {
        this.researcherController = researcherController;
        scanner = new Scanner(System.in);
        this.researcher = researcher;
    }

    public void getDefaultView() {
        System.out.println("Welcome to Researcher System");
        System.out.println("1. Publish Paper");
        System.out.println("2. Delete Paper");
        System.out.println("3. Print Papers");
        System.out.println("4. Calculate H-Index");

        System.out.print("Select option: ");
        int option = scanner.nextInt();
        scanner.nextLine(); 

        switch (option) {
            case 1:
                System.out.print("Enter paper title: ");
                String title = scanner.nextLine();
                researcherController.publishPaper(new ResearchPaper(title));
                break;
            case 2:
              
                break;
            case 3:
              
                break;
            case 4:
                int hIndex = researcherController.calculateHIndex();
                System.out.println("H-Index: " + hIndex);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
