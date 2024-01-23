package tts.task.category;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChildrenCategoryTest {

    @ParameterizedTest
    @CsvSource({
            "0, 0", // Case 1: When rented day is 0
            "1, 1.5", // Case 2: When rented day is 1
            "2, 1.5", // Case 2: When rented day is 2
            "3, 1.5", // Case 2: When rented day is 3
            "4, 3",   // Case 3: When rented day is 4
            "5, 4.5", // Case 3: When rented day is 5
            "6, 6",   // Case 3: When rented day is 6
            "7, 7.5"  // Case 3: When rented day is 7
    })
    void calculateRentalAmount(int rentedDays, double expectedAmount) {
        ChildrenCategory category = new ChildrenCategory();
        assertEquals(expectedAmount, category.calculateRentalAmount(rentedDays), 0.001);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0", // Case 1: When rented day is 0
            "1, 1", // Case 2: When rented day is 1
            "2, 1", // Case 2: When rented day is 2
            "10, 1" // Case 2: When rented day is 10
    })
    void calculateRewardPoints(int rentedDays, int expectedPoints) {
        ChildrenCategory category = new ChildrenCategory();
        assertEquals(expectedPoints, category.calculateRewardPoints(rentedDays));
    }
}
