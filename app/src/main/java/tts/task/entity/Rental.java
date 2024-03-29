package tts.task.entity;

public class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public double calculateRentalAmount() {
        return movie.getCategory().calculateRentalAmount(daysRented);
    }

    public int calculateRewardPoints() {
        return movie.getCategory().calculateRewardPoints(daysRented);
    }
}
