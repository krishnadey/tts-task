package tts.task.category;

class ClassicCategory implements MovieCategory {
    @Override
    public double calculateRentalAmount(int daysRented) {
        return Math.max(0, daysRented);
    }

    @Override
    public int calculateRewardPoints(int daysRented) {
        return daysRented;
    }
}
