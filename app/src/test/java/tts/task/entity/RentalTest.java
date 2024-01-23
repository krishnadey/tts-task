package tts.task.entity;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import tts.task.category.MovieCategory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class RentalTest {

    @Mock
    private Movie movie;

    @Mock
    private MovieCategory category;

    @Test
    void calculateRentalAmount() {
        // Mocking behavior for the movie and its category
        when(movie.getCategory()).thenReturn(category);
        when(category.calculateRentalAmount(3)).thenReturn(7.5);

        // Setting the mocked movie and rented days
        Rental rental = new Rental(movie, 3);

        // Performing the test
        double rentalAmount = rental.calculateRentalAmount();

        // Verifying that the correct methods are called
        verify(movie).getCategory();
        verify(category).calculateRentalAmount(3);

        // Verifying the result
        assertEquals(7.5, rentalAmount, 0.001);
    }

    @Test
    void calculateRewardPoints() {
        // Mocking behavior for the movie and its category
        when(movie.getCategory()).thenReturn(category);
        when(category.calculateRewardPoints(2)).thenReturn(3);

        // Setting the mocked movie and rented days
        Rental rental = new Rental(movie, 2);

        // Performing the test
        int rewardPoints = rental.calculateRewardPoints();

        // Verifying that the correct methods are called
        verify(movie).getCategory();
        verify(category).calculateRewardPoints(2);

        // Verifying the result
        assertEquals(3, rewardPoints);
    }
}
