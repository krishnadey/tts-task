package tts.task.category;

class ClassicCategory implements MovieCategory {
    @Override
    public double calculateRentalAmount(int daysRented) {
        return daysRented > 0 ? daysRented : 0;
    }

    @Override
    public int calculateRewardPoints(int daysRented) {
        return daysRented > 0 ? daysRented : 0;
    }
}
