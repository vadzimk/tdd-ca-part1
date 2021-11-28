package link.vadzimk.math.test;

import link.vadzimk.math.Fraction;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FractionEqualsTest {
    @Test
    public void sameNumeratorAndDenominator(){
        assertEquals(new Fraction(3,5), new Fraction(3,5));
    }
    @Test
    public void differentNumerators(){
        assertNotEquals(new Fraction(1,5), new Fraction(2, 5));
    }
    @Test
    public void differentDenominators(){
        assertNotEquals(new Fraction(3,4), new Fraction(3,7));
    }

    @Test
    public void wholeNumberSameFraction() {
        assertEquals(new Fraction(5,1), new Fraction(5));
    }

    @Test
    public void wholeNumberDifferentWholeNumber() {
        assertNotEquals(new Fraction(6), new Fraction(5));
    }

    @Test
    @Ignore("Waiting to implement reduction")
    public void reduce() {
        assertEquals(new Fraction(3,4), new Fraction(6,8));
    }
}
