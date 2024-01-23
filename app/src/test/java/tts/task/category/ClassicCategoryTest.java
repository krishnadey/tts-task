package tts.task.category;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassicCategoryTest {
    @ParameterizedTest
    @CsvSource({
            "2, 2.0", // Case 1: When rented day is 2
            "4, 4.0", // Case 2: When rented day is 4
            "0, 0.0"  // Additional case: When rented day is 0
    })
    void calculateRentalAmount(int rentedDays, double expectedAmount) {
        ClassicCategory category = new ClassicCategory();
        assertEquals(expectedAmount, category.calculateRentalAmount(rentedDays), 0.001);
    }

    @ParameterizedTest
    @CsvSource({
            "2, 2", // Case 1: When rented day is 2
            "4, 4", // Case 2: When rented day is 4
            "0, 0"  // Additional case: When rented day is 0
    })
    void calculateRewardPoints(int rentedDays, int expectedPoints) {
        ClassicCategory category = new ClassicCategory();
        assertEquals(expectedPoints, category.calculateRewardPoints(rentedDays));
    }
}
