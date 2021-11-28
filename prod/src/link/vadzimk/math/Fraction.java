package link.vadzimk.math;

public class Fraction {
    private final int denominator;
    private final int numerator;

    public Fraction(int integerValue) {
        this.numerator = integerValue;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction plus(Fraction that) {
        return new Fraction(this.numerator + that.numerator, this.denominator);
    }

    public int intValue() {
        return numerator;
    }


    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }
}
