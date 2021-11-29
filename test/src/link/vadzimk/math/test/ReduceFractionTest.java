package link.vadzimk.math.test;

import link.vadzimk.math.Fraction;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReduceFractionTest {
    @Test
    public void alreadyInLowestTerms() {
        // We already tested this in FractionEqualsTest... this is a duplicate
        assertEquals(new Fraction(3,4), new Fraction(3,4));
    }

    @Test
//    @Ignore("Waiting to implement GCD")
    public void reduceToNotWholeNumber() {
        assertEquals(new Fraction(3,4), new Fraction(6,8));
    }

    @Test
    public void reduceToWholeNumber() {
        assertEquals(new Fraction(6), new Fraction(24, 4));
    }
}