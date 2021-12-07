package put.io.testing.junit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
//        Calculator calculator = new Calculator();
        assertEquals( 6, calculator.multiply(3, 2));
    }

    @Test
    void multiply() {
//        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(3, 2));
    }

    @Test
    void addPositiveNumber() {
//        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> {calculator.addPositiveNumbers(-5, 2); });
    }
}
