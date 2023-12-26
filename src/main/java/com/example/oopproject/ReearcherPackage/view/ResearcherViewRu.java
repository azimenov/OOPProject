package com.example.oopproject.ResearcherPackage.view;

import com.example.oopproject.ResearcherPackage.controller.ResearcherController;
import com.example.oopproject.ResearcherPackage.model.ResearchPaper;
import com.example.oopproject.ResearcherPackage.model.Researcher;

import java.util.Scanner;

// Represents the view for a Researcher in Russian, extending ResearcherViewEn
public class ResearcherViewRu extends ResearcherViewEn {

    // Constructor to initialize ResearcherViewRu
    public ResearcherViewRu(ResearcherController researcherController, Researcher researcher) {
        super(researcherController, researcher);
    }

    // Method to display the default view for a researcher in Russian
    @Override
    public void getDefaultView() {
        System.out.println("«Добро пожаловать в Исследовательскую систему»");
        System.out.println("1. Опубликовать статью");
        System.out.println("2. Удалить бумагу");
        System.out.println("3. Распечатать документы");
        System.out.println("4. Рассчитать H-индекс");

        System.out.print("Выберите опцию: ");
        int option = scanner.nextInt();
        scanner.nextLine(); // Consumes the newline character after reading the integer input

        switch (option) {
            case 1:
                System.out.print("Введите название статьи: ");
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
                System.out.println("Неверный выбор");
        }
    }
}
