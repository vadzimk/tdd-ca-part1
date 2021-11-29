package link.vadzimk.math;

public class NumberTheory {
    // gcd never returns zero
    public static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % t;
            a = t;
        }
        return Math.abs(a);
    }

}
