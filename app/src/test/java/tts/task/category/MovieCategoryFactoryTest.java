package tts.task.category;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MovieCategoryFactoryTest {
    @Test
    void createNewReleaseCategory() {
        MovieCategory category = MovieCategoryFactory.createCategory(CategoryType.NEW_RELEASE);
        assertTrue(category instanceof NewReleaseCategory);
    }

    @Test
    void createRegularCategory() {
        MovieCategory category = MovieCategoryFactory.createCategory(CategoryType.REGULAR);
        assertTrue(category instanceof RegularCategory);
    }

    @Test
    void createClassicCategory() {
        MovieCategory category = MovieCategoryFactory.createCategory(CategoryType.CLASSIC);
        assertTrue(category instanceof ClassicCategory);
    }

    @Test
    void createChildrenCategory() {
        MovieCategory category = MovieCategoryFactory.createCategory(CategoryType.CHILDREN);
        assertTrue(category instanceof ChildrenCategory);
    }
}
