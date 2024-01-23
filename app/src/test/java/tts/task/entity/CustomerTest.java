package tts.task.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import tts.task.category.CategoryType;

public class CustomerTest {
    @Test
    void calculateTotalAmount() {
        Movie movie1 = new Movie("Inception", CategoryType.NEW_RELEASE);
        Movie movie2 = new Movie("The Godfather",  CategoryType.CLASSIC);
        Movie movie3 = new Movie("Spider-Man", CategoryType.REGULAR);
        Movie movie4 = new Movie("Frozen", CategoryType.CHILDREN);

        Rental rental1 = new Rental(movie1, 2);
        Rental rental2 = new Rental(movie2, 3);
        Rental rental3 = new Rental(movie3, 4);
        Rental rental4 = new Rental(movie4, 6);

        Customer customer = new Customer("John Doe");
        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);
        customer.addRental(rental4);

        double totalAmount = customer.calculateTotalAmount();

        // Assuming total amount is (2 * 3) + (3) + (2 + (4-2) * 1.5)  + (1.5 + (3*1.5))
        assertEquals(20.0, totalAmount, 0.001);
    }
}
