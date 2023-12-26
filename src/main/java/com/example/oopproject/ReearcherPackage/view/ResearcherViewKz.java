package com.example.oopproject.ResearcherPackage.view;

import com.example.oopproject.ResearcherPackage.controller.ResearcherController;
import com.example.oopproject.ResearcherPackage.model.ResearchPaper;
import com.example.oopproject.ResearcherPackage.model.Researcher;

import java.util.Scanner;

// Represents the view for a Researcher in Kazakh extending ResearcherViewEn
public class ResearcherViewKz extends ResearcherViewEn {

    // Constructor to initialize ResearcherViewKz
    public ResearcherViewKz(ResearcherController researcherController, Researcher researcher) {
        super(researcherController, researcher);
    }

    // Method to display the default view for a researcher in Kazakh
    @Override
    public void getDefaultView() {
        System.out.println("«Зерттеуші жүйесіне қош келдіңіз»");
        System.out.println("1. Қағазды жариялау");
        System.out.println("2. Қағазды жою");
        System.out.println("3. Қағаздарды басып шығару");
        System.out.println("4. H-индексін есептеу");

        System.out.print("Опцияны таңдаңыз: ");
        int option = scanner.nextInt();
        scanner.nextLine(); // Consumes the newline character after reading the integer input

        switch (option) {
            case 1:
                System.out.print("Мақаланың тақырыбын енгізіңіз: ");
                String title = scanner.nextLine();
                researcherController.publishPaper(new ResearchPaper(title));
                break;
            case 2:
                // Code to delete a paper
                break;
            case 3:
                // Code to print papers
                break;
            case 4:
                int hIndex = researcherController.calculateHIndex();
                System.out.println("H-индекс: " + hIndex);
                break;
            default:
                System.out.println("Қате таңдау");
        }
    }
}
