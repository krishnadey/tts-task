package tts.task.category;

class ChildrenCategory implements MovieCategory {
    
    /**
     * Calculates the rental amount for a children's movie based on the number of days rented.
     * Base rental amount is $1.5, and an additional $1.5 is added for each day after the first 3 days.
     * The final rental amount is non-negative
     *
     * @param daysRented The number of days the movie is rented for.
     * @return The calculated rental amount.
     */
    @Override
    public double calculateRentalAmount(int daysRented) {
        
        if (daysRented > 0) {
            double rentalAmount = 1.5;
            if (daysRented > 3) {
                // Additional rental amount for each day after the first 3 days
                rentalAmount += (daysRented - 3) * 1.5;
            }
            return rentalAmount;
        }
        return 0;
    }

    /**
     * Calculates the reward points for renting a children's movie based on the number of days rented.
     * 1 reward point is allotted for any non-zero number of days rented.
     *
     * @param daysRented The number of days the movie is rented for.
     * @return The calculated reward points.
     */
    @Override
    public int calculateRewardPoints(int daysRented) {
        // 1 reward point is allotted irrespective of the number of days rented
        return daysRented > 0 ? 1 : 0;
    }
}
