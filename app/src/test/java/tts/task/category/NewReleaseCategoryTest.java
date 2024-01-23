package tts.task.category;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewReleaseCategoryTest {

    @ParameterizedTest
    @CsvSource({
            "2, 6.0", // Case 1: When rented day is 2
            "3, 9.0", // Case 2: When rented day is 3
            "0, 0.0"  // Additional case: When rented day is 0
    })
    void calculateRentalAmount(int rentedDays, double expectedAmount) {
        NewReleaseCategory category = new NewReleaseCategory();
        assertEquals(expectedAmount, category.calculateRentalAmount(rentedDays), 0.001);
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1", // Case 1: When rented day is 1
            "2, 2", // Case 2: When rented day is 2
            "10, 2", // Case 3: When rented day is 10
            "0, 0"  // Additional case: When rented day is 0
    })
    void calculateRewardPoints(int rentedDays, int expectedPoints) {
        NewReleaseCategory category = new NewReleaseCategory();
        assertEquals(expectedPoints, category.calculateRewardPoints(rentedDays));
    }
}
