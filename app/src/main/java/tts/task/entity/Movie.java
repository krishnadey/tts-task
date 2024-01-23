package tts.task.entity;

import tts.task.category.CategoryType;
import tts.task.category.MovieCategory;
import tts.task.category.MovieCategoryFactory;

public class Movie {
    private String title;
    private MovieCategory category;

    public Movie(String title, CategoryType categoryType) {
        this.title = title;
        this.category = MovieCategoryFactory.createCategory(categoryType);
    }

    public String getTitle() {
        return title;
    }

    public MovieCategory getCategory() {
        return category;
    }
}
