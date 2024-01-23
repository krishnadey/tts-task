package tts.task.category;

class NewReleaseCategory implements MovieCategory {
    @Override
    public double calculateRentalAmount(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public int calculateRewardPoints(int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}