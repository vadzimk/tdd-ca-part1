package link.vadzimk.math.test;

import link.vadzimk.math.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddFractionsTest {
    @Test
    public void zeroPlusZero() {
        Fraction sum = new Fraction(0).plus(new Fraction(0));
        assertEquals(new Fraction(0), sum);
    }

    @Test
    public void nonZeroPlusZero() {
        final Fraction sum = new Fraction(3).plus(new Fraction(0));
        assertEquals(new Fraction(3), sum);
    }

    @Test
    public void zeroPlusNonZero() {
        final Fraction sum = new Fraction(0).plus(new Fraction(5));
        assertEquals(new Fraction(5), sum);
    }

    @Test
    public void positiveOperands() {
        final Fraction sum = new Fraction(3).plus(new Fraction(4));
        assertEquals(new Fraction(7), sum);
    }

    @Test
    public void negativeInputsNegativeOutput() {
        final Fraction sum = new Fraction(-3).plus(new Fraction(1));
        assertEquals(new Fraction(-2), sum);
    }

    @Test
    public void nonTrivialCommonDenominator() {
        final Fraction sum = new Fraction(1, 5).plus(new Fraction(2, 5));
        assertEquals(new Fraction(3, 5), sum);
    }

    @Test
    public void differentDenominatorsWithoutReducing() {
        assertEquals(
                new Fraction(5, 6),
                new Fraction(1, 2).plus(new Fraction(1, 3)));
    }
}
