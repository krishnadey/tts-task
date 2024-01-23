package tts.task.category;

class NewReleaseCategory implements MovieCategory {

    /**
     * Calculates the rental amount for a new release movie based on the number of days rented.
     * The rental cost is $3 per day.
     *
     * @param daysRented The number of days the movie is rented for.
     * @return The calculated rental amount.
     */
    @Override
    public double calculateRentalAmount(int daysRented) {
        // Rental cost is $3 per day for new release movies
        return daysRented * 3;
    }

    /**
     * Calculates the reward points for renting a new release movie based on the number of days rented.
     * Reward points are earned based on the duration of the rental.
     * - 1 reward point is earned for renting at least one day.
     * - An additional point is earned for renting more than one day.
     *
     * @param daysRented The number of days the movie is rented for.
     * @return The calculated reward points.
     */
    @Override
    public int calculateRewardPoints(int daysRented) {
        // Reward points are earned based on the duration of the rental
        if (daysRented > 0) {
            return daysRented > 1 ? 2 : 1;
        }
        return 0;
    }
}
