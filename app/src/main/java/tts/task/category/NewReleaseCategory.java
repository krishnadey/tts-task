package tts.task.category;

class NewReleaseCategory implements MovieCategory {
    @Override
    public double calculateRentalAmount(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public int calculateRewardPoints(int daysRented) {
        if (daysRented > 0) {
            return daysRented > 1 ? 2 : 1;
        }
        return 0;
    }
}