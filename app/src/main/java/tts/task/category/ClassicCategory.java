package tts.task.category;

class ClassicCategory implements MovieCategory {

    /**
     * Calculates the rental amount for a classic movie based on the number of days rented.
     * The rental cost is $1 per day, and there is no fixed rental cost.
     *
     * @param daysRented The number of days the movie is rented for.
     * @return The calculated rental amount.
     */
    @Override
    public double calculateRentalAmount(int daysRented) {
        // Rental cost is $1 per day, and there is no fixed rental cost
        return daysRented > 0 ? daysRented : 0;
    }

    /**
     * Calculates the reward points for renting a classic movie based on the number of days rented.
     * Reward points are earned for each day rented.
     *
     * @param daysRented The number of days the movie is rented for.
     * @return The calculated reward points.
     */
    @Override
    public int calculateRewardPoints(int daysRented) {
        // Reward points are earned for each day rented
        return daysRented > 0 ? daysRented : 0;
    }
}
