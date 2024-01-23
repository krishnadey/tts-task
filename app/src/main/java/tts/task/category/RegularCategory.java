package tts.task.category;

class RegularCategory implements MovieCategory {

    /**
     * Calculates the rental amount for a regular movie based on the number of days rented.
     * The rental cost is $2 for the first 2 days and $1.5 for each additional day.
     *
     * @param daysRented The number of days the movie is rented for.
     * @return The calculated rental amount.
     */
    @Override
    public double calculateRentalAmount(int daysRented) {
        // Rental cost is $2 for the first 2 days and $1.5 for each additional day
        if (daysRented > 0) {
            double rentalAmount = 2;
            if (daysRented > 2) {
                rentalAmount += (daysRented - 2) * 1.5;
            }
            return rentalAmount;
        }
        return 0;
    }

    /**
     * Calculates the reward points for renting a regular movie based on the number of days rented.
     * 1 reward point is allotted for any non-zero number of days rented.
     *
     * @param daysRented The number of days the movie is rented for.
     * @return The calculated reward points.
     */
    @Override
    public int calculateRewardPoints(int daysRented) {
        // 1 reward point is allotted for any non-zero number of days rented
        return daysRented > 0 ? 1 : 0;
    }
}
