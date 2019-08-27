package pl.rengreen.reversedigits;

import org.junit.Test;

import static org.junit.Assert.*;

public class DigitsTest {
    private Digits digits = new Digits();

    @Test
    public void reverseDigits_54321ShouldGive12345() {
        assertEquals(12345, digits.reverseDigits(54321));
    }

    @Test
    public void reverseDigits_1ShouldGive1() {
        assertEquals(1, digits.reverseDigits(1));
    }

    @Test
    public void reverseDigits_0ShouldGive0() {
        assertEquals(0, digits.reverseDigits(0));
    }

}