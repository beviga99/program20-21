package javabasics;

public class SumAverageRunningInt2 {

    public static void main(String[] args) {

        int sum = 0;
        double average;
        int lowerbound = 1;
        int upperbound = 100;
        int number = lowerbound;

        while (number <= upperbound) {
            sum += number;
            ++number;
        }
        {
            average = (double) sum / upperbound;
        }

        System.out.println("The sum of odd numbers is: " + sum);
        System.out.println("The average of odd numbers is: " + average);
    }
}
