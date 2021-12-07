package put.io.testing.audiobooks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AudiobookPriceCalculatorTest {
    @Test
    void calculate1() {
        Customer customer = new Customer("Gustaw", Customer.LoyaltyLevel.SILVER, true);
        Audiobook audiobook = new Audiobook("Idiota", 20);
        AudiobookPriceCalculator calculator = new AudiobookPriceCalculator();
        assertEquals( 0, calculator.calculate(customer, audiobook));
    }

    @Test
    void calculate2() {
        Customer customer = new Customer("Gustaw", Customer.LoyaltyLevel.SILVER, false);
        Audiobook audiobook = new Audiobook("Idiota", 20);
        AudiobookPriceCalculator calculator = new AudiobookPriceCalculator();
        assertEquals( 18, calculator.calculate(customer, audiobook));
    }

    @Test
    void calculate3() {
        Customer customer = new Customer("Gustaw", Customer.LoyaltyLevel.GOLD, false);
        Audiobook audiobook = new Audiobook("Idiota", 20);
        AudiobookPriceCalculator calculator = new AudiobookPriceCalculator();
        assertEquals( 16, calculator.calculate(customer, audiobook));
    }

    @Test
    void calculate4() {
        Customer customer = new Customer("Gustaw", Customer.LoyaltyLevel.STANDARD, false);
        Audiobook audiobook = new Audiobook("Idiota", 20);
        AudiobookPriceCalculator calculator = new AudiobookPriceCalculator();
        assertEquals( 20, calculator.calculate(customer, audiobook));
    }

}