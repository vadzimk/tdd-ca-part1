package link.vadzimk.math.test;

import link.vadzimk.math.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddFractionsTest {
    @Test
    public void zeroPlusZero() {
        Fraction sum = new Fraction(0).plus(new Fraction(0));
        assertEquals(0, sum.intValue());
    }
    @Test
    public void nonZeroPlusZero() {
        final Fraction sum = new Fraction(3).plus(new Fraction(0));
        assertEquals(3, sum.intValue());
    }
    @Test
    public void zeroPlusNonZero() {
        final Fraction sum = new Fraction(0).plus(new Fraction(5));
        assertEquals(5, sum.intValue());
    }
    @Test
    public void positiveOperands() {
        final Fraction  sum = new Fraction(3).plus(new Fraction(4));
        assertEquals(7, sum.intValue());
    }
    @Test
    public void negativeInputsNegativeOutput(){
        final Fraction sum = new Fraction(-3).plus(new Fraction(1));
        assertEquals(-2, sum.intValue());
    }

}
