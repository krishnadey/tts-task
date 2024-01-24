package tts.task.entity;

import java.util.ArrayList;
import java.util.List;

import tts.task.promotion.Rent3Get1FreePromotion;

public class Customer {
    private String name;
    private List<Rental> rentals;

    public Customer(String name) {
        this.name = name;
        this.rentals = new ArrayList<Rental>();
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
            totalAmount += rental.calculateRentalAmount();
        }
        return totalAmount;
    }

    public int calculateTotalRewardPoints() {
        int totalRewardPoints = 0;
        for (Rental rental : rentals) {
            totalRewardPoints += rental.calculateRewardPoints();
        }
        return totalRewardPoints;
    }

    public String generateStatement() {
        double totalAmount = 0;
        int totalRewardPoints = 0;
        StringBuilder result = new StringBuilder("Rental record for " + getName() + "\n\n");
        result.append(String.format("%-20s%-15s%-10s\n", "Movie Name", "Rented Days", "Amount"));

        for (Rental rental : rentals) {
            double amount = rental.calculateRentalAmount();
            result.append(String.format("%-20s%-15s%-10s\n",
                    rental.getMovie().getTitle(),
                    rental.getDaysRented(),
                    formatAmount(amount)));
            totalAmount += amount;
            totalRewardPoints += rental.calculateRewardPoints();
        }

        Rental appliedRental = Rent3Get1FreePromotion.getApplicablePromotionRental(rentals);
        if (appliedRental != null) {
            result.append("\n Promotion Applied. You got " + appliedRental.getMovie().getTitle() + " Free.\n");
            totalAmount -= appliedRental.calculateRentalAmount();
        }

        result.append("\nTotal amount owed is ").append(formatAmount(totalAmount)).append("\n");
        result.append("\nYou earned ").append(totalRewardPoints).append(" frequent renter points");
        return result.toString();
    }

    private String formatAmount(double amount) {
        return String.format("$%.2f", amount);
    }
}
