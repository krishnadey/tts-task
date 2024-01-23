package tts.task.category;

class ChildrenCategory implements MovieCategory {
    @Override
    public double calculateRentalAmount(int daysRented) {
        if (daysRented > 0) {
            double rentalAmount = 1.5;
            if (daysRented > 3) {
                rentalAmount += (daysRented - 3) * 1.5;
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
