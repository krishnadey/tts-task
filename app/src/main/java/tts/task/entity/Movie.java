package tts.task.entity;

import tts.task.category.CategoryType;
import tts.task.category.MovieCategory;

public class Movie {
    private String title;
    private MovieCategory category;

    public Movie(String title, CategoryType categoryType) {
        this.title = title;
        // create a factory class to get specific category object
    }

    public String getTitle() {
        return title;
    }

    public MovieCategory getCategory() {
        return category;
    }
}
