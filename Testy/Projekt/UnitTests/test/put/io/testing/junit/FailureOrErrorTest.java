package put.io.testing.junit;

import org.junit.jupiter.api.Test;

import java.security.spec.ECField;

import static org.junit.jupiter.api.Assertions.*;

class FailureOrErrorTest {

    @Test
    void test1() {
        assertEquals(2, 5);
    }

    @Test
    void test2() {
        throw new NullPointerException();
    }

    @Test
    void test3() throws Exception{
        try {
            assertEquals(2, 5);
        } catch(AssertionError e) {
            e.printStackTrace();
        }
    }
}