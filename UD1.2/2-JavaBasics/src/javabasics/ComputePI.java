package javabasics;

public class ComputePI {

    public static void main(String[] args) {

        long maxDenominator = 1000000000;
        int denominator = 1;
        double sum = 0.0;

        while (denominator <= maxDenominator) {

            if (denominator % 4 == 1) {
                sum += 1.0 / denominator;

            } else if (denominator % 4 == 3) {
                sum -= 1.0 / denominator;

            }
            ++denominator;
        }
        sum *= 4;
        System.out.println("PI is: " + sum);
    }
}
