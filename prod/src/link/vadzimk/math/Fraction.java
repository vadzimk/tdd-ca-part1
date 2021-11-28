package link.vadzimk.math;

public class Fraction {
    private final int integerValue;
    private final int denominator;
    private final int numerator;

    public Fraction(int integerValue) {
        this.integerValue = integerValue;
        this.numerator = integerValue;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.integerValue = numerator;
        this.denominator = denominator;
    }

    public Fraction plus(Fraction that) {
        return new Fraction(this.integerValue + that.integerValue, this.denominator);
    }

    public int intValue() {
        return integerValue;
    }


    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }
}
