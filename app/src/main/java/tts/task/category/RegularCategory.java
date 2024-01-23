package tts.task.category;

class RegularCategory implements MovieCategory {
    @Override
    public double calculateRentalAmount(int daysRented) {
        if (daysRented > 0 ) {
            double rentalAmount = 2;
            if (daysRented > 2) {
                rentalAmount += (daysRented - 2) * 1.5;
            }
            return rentalAmount;
        }
        return 0;
    }

    @Override
    public int calculateRewardPoints(int daysRented) {
        return daysRented > 0 ? 1 : 0;
    }
}