package com.example.oopproject.ManagerService;

import java.util.ArrayList;
import java.util.List;

public class News {
    private List<String> newsList;

    public News() {
        this.newsList = new ArrayList<>();
    }

    // Метод для добавления новости
    public void addNews(String news) {
        newsList.add(news);
    }

    // Метод для удаления новости
    public void removeNews(String news) {
        newsList.remove(news);
    }

    // Метод для получения списка новостей
    public List<String> getNewsList() {
        return newsList;
    }
}

