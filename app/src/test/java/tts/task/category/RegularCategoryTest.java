package tts.task.category;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegularCategoryTest {
    @ParameterizedTest
    @CsvSource({
            "1, 2.0", // Case 1: When rented day is 2
            "2, 2.0", // Case 2: When rented day is 2
            "3, 3.5", // Case 3: When rented day is 3
            "10, 14", // Case 3: When rented day is 3
            "0, 0.0"  // Additional case: When rented day is 0
    })
    void calculateRentalAmount(int rentedDays, double expectedAmount) {
        RegularCategory category = new RegularCategory();
        assertEquals(expectedAmount, category.calculateRentalAmount(rentedDays), 0.001);
    }

    @ParameterizedTest
    @CsvSource({
            "2, 1", // Case 1: When rented day is 2
            "1, 1", // Case 2: When rented day is 1
            "0, 0"  // Additional case: When rented day is 0
    })
    void calculateRewardPoints(int rentedDays, int expectedPoints) {
        RegularCategory category = new RegularCategory();
        assertEquals(expectedPoints, category.calculateRewardPoints(rentedDays));
    }
}
