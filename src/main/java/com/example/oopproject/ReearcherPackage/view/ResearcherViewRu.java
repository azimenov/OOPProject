
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
       System.out.println("«Добро пожаловать в Исследовательскую систему»");
         System.out.println("1. Опубликовать статью");
         System.out.println("2. Удалить бумагу");
         System.out.println("3. Распечатать документы");
         System.out.println("4. Рассчитать H-индекс");

        System.out.print("Выберите опцию: ");
        int option = scanner.nextInt();
        scanner.nextLine(); 

        switch (option) {
            case 1:
                System.out.print("Введите название статьи: ");
                String title = scanner.nextLine();
                researcherController.publishPaper(new ResearchPaper(title));
                break;
            case 2:
              
                break;
            case 3:
              
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
