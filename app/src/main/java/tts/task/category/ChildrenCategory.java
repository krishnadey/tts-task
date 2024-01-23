package tts.task.category;

class ChildrenCategory implements MovieCategory {
    @Override
    public double calculateRentalAmount(int daysRented) {
        double rentalAmount = 1.5;
        if (daysRented > 3) {
            rentalAmount += (daysRented - 3) * 1.5;
        }
        return rentalAmount;
    }

    @Override
    public int calculateRewardPoints(int daysRented) {
        return 1;
    }
}
