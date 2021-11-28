package link.vadzimk.math;

public class Fraction {
    private final int denominator;
    private final int numerator;

    public Fraction(int integerValue) {
        this(integerValue, 1);

    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction plus(Fraction that) {
        if (this.denominator != that.denominator) {
            // 1   1   3*1   2*1   5
            // - + - = --- + --- = -
            // 2   3   3*2   2*3   6
            return new Fraction(this.numerator * that.denominator + that.numerator * this.denominator, this.denominator * that.denominator);
        } else
            return new Fraction(this.numerator + that.numerator, this.denominator);
    }


    @Override
    public String toString() {
        return String.format("%d/%d", numerator, denominator);
    }

    // will not work for subclasses, better make Fraction class final
    @Override
    public boolean equals(Object other) {
        if (other instanceof Fraction) {
            Fraction that = (Fraction) other;
            return this.numerator == that.numerator && this.denominator == that.denominator;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return numerator * 19 + denominator;
    }
}
