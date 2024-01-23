# TTS Backend Take Home Challenge

Thank you for your interest in working at Tap-tap Send. If you are reading this then it means we are excited about you and want to know more about how you approach technical problems. This task is written in Java, but if you prefer to convert it to Kotlin (our backend language of choice) then feel free.

This should take no more than 3 hours. Furthermore, we would like to see your work within 3 business days of receiving this challenge. Please let us know if that will be a problem. When you've completed the task, please send us a link to a Github repository with your work. Someone on our team will review within 1 business day and follow up with you about next steps.

If you have any questions or need clarification, don't hesitate to ask. Good luck!

### Requirements

You are writing code for a company that builds software to track and invoice for movie rentals and are asked to add a new billing rule for classic movies:

- Renting a classic movie costs $1 per day, earns 1 reward point per day, and has no fixed rental cost.

The codebase works in its current form, but was originally written by a junior engineer. Refactor the code as you see necessary and add the new billing rule. Make reasonable assumptions and document them.

We will check that your code works, but are more interested in your approach to refactoring, code design, and the decisions you make. We will be asking you about the decisions you made in the next phase of the the interview so be prepared to speak to them.

# Solution

## Project Structure

The project is structured as follows:

- `tts.task.entity`: Contains classes for the core entities of the system.
  - `Movie`: Represents a movie.
  - `Rental`: Represents a rental of a movie.
  - `Customer`: Represents a customer.

- `tts.task.category`: Contains the interfaces and implementations for movie categories.
  - `MovieCategory`: Interface for movie categories.
  - `NewReleaseCategory`, `RegularCategory`, `ChildrenCategory`, `ClassicCategory`: Implementations of movie categories.

- `tts.task.Main`: Contains a simple main class to demonstrate the usage of the system.

- `tts.task.Test`: Contains JUnit tests for the entities and categories.

## Usage

To use the Movie Rental System:

1. Create instances of `Movie`, specifying the title and category.
2. Create instances of `Rental`, specifying the movie and the number of days rented.
3. Create instances of `Customer` with a name.
4. Add rentals to the customer using `addRental`.
5. Use `calculateTotalAmount` and `calculateTotalRewardPoints` to get customer statistics.
6. Use `generateStatement` to generate a rental statement for the customer.

## Example

```java
// Example usage in Main class
public class Main {
    public static void main(String[] args) {
        Movie inception = new Movie("Inception", CategoryType.NEW_RELEASE);
        Rental rental1 = new Rental(inception, 2);

        Movie godfather = new Movie("The Godfather",  CategoryType.CLASSIC);
        Rental rental2 = new Rental(godfather, 3);

        Customer customer = new Customer("John Doe");
        customer.addRental(rental1);
        customer.addRental(rental2);

        System.out.println(customer.generateStatement());
    }
}
```
Example Output
```txt
Rental record for John Doe

Movie Name          Rented Days    Amount    
Inception           2              $6.00     
The Godfather       3              $3.00     

Total amount owed is $9.00

You earned 5 frequent renter points
```
