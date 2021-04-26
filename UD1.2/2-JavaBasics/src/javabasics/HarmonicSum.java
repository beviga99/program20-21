package javabasics;

public class HarmonicSum {

    public static void main(String[] args) {

        int maxDenominator = 50000;
        double sumL2R = 0.0;
        double sumR2L = 0.0;
        double absDiff;
        int minDenominator = 1;

        for (int denominator = 1; denominator <= maxDenominator; ++denominator) {

            sumL2R = sumL2R + 1.0 / denominator;
        }
        System.out.println("The sum from left-to-right is: " + sumL2R);

        for (int denominator = 50000; denominator >= minDenominator; --denominator) {
            sumR2L = sumR2L + 1.0 / denominator;
        }
        System.out.println("The sum from left-to-right is: " + sumR2L);

        if (sumL2R > sumR2L) {
            absDiff = sumL2R - sumR2L;
        } else {
            absDiff = sumR2L - sumL2R;
        }
        System.out.println("The absolute difference is " + absDiff);
    }
}
