package tts.task.category;

public class MovieCategoryFactory {
    public static MovieCategory createCategory(CategoryType categoryType) {
        switch (categoryType) {
            case NEW_RELEASE:
                return new NewReleaseCategory();
            case REGULAR:
                return new RegularCategory();
            case CLASSIC:
                return new ClassicCategory();
            default:
                throw new IllegalArgumentException("Invalid category type");
        }
    }
}