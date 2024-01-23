package tts.task.entity;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import tts.task.category.CategoryType;
import tts.task.category.MovieCategory;

public class MovieTest {
    @Test
    void getCategory() {
        Movie movie = new Movie("Inception", CategoryType.NEW_RELEASE);
        assertTrue(movie.getCategory() instanceof MovieCategory);
    }
}
