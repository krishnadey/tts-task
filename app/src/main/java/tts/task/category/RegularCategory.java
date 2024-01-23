package tts.task.category;

class RegularCategory implements MovieCategory {
    @Override
    public double calculateRentalAmount(int daysRented) {
        double rentalAmount = 2;
        if (daysRented > 2) {
            rentalAmount += (daysRented - 2) * 1.5;
        }
        return rentalAmount;
    }

    @Override
    public int calculateRewardPoints(int daysRented) {
        return 1;
    }
}