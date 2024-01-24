package tts.task.promotion;

import java.util.List;

import tts.task.entity.Rental;

public class Rent3Get1FreePromotion {
    public static Rental getApplicablePromotionRental(List<Rental> rentals) {
        if (rentals.size() <= 2)
            return null;
        Rental minRentalCostMovie = rentals.get(0);
        for (Rental rentedMovie: rentals) {
            if (rentedMovie.calculateRentalAmount() < minRentalCostMovie.calculateRentalAmount()) {
                minRentalCostMovie = rentedMovie;
            }
        }
        return minRentalCostMovie;
    }
}