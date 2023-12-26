package com.example.oopproject.ManagerService;

import java.util.ArrayList;
import java.util.List;

/**
 * News class manages a list of news items.
 */
public class News {
    private List<String> newsList;

    /**
     * Constructor initializes the news list as an empty ArrayList.
     */
    public News() {
        this.newsList = new ArrayList<>();
    }

    /**
     * Adds a news item to the news list.
     * @param news The news item to be added.
     */
    public void addNews(String news) {
        newsList.add(news);
    }

    /**
     * Removes a news item from the news list.
     * @param news The news item to be removed.
     */
    public void removeNews(String news) {
        newsList.remove(news);
    }

    /**
     * Retrieves the list of news items.
     * @return The list of news items.
     */
    public List<String> getNewsList() {
        return newsList;
    }
}
