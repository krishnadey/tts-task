package tts.task.entity;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals;

    public Customer(String name) {
        this.name = name;
        this.rentals = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public double calculateTotalAmount() {
        double totalAmount = 0;
        for (Rental rental : rentals) {
            totalAmount += rental.getMovie().getCategory().calculateRentalAmount(rental.getDaysRented());
        }
        return totalAmount;
    }

    public int calculateTotalRewardPoints() {
        int totalRewardPoints = 0;
        for (Rental rental : rentals) {
            totalRewardPoints += rental.getMovie().getCategory().calculateRewardPoints(rental.getDaysRented());
        }
        return totalRewardPoints;
    }

    public String statement() {
        double totalAmount = 0;
        int totalRewardPoints = 0;
        String result = "Rental record for " + getName() + "\n";

        for (Rental rental : rentals) {
            double amount = rental.getMovie().getCategory().calculateRentalAmount(rental.getDaysRented());
            totalRewardPoints += rental.getMovie().getCategory().calculateRewardPoints(rental.getDaysRented());
            result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(amount) + "\n";
            totalAmount += amount;
        }

        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(totalRewardPoints) + " frequent renter points";
        return result;
    }
}
