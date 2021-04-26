package javabasics;

public class SumAverageRunningInt4 {

    public static void main(String[] args) {

        double average;
        int lowerbound = 111;
        int upperbound = 8899;
        int count = 0;

        for (int number = lowerbound; number <= upperbound; ++number) {

            count += number;
        }
        {
            average = (double) count / upperbound;
        }
        System.out.println("The sum of numbers is: " + count);
        System.out.println("The average of numbers is: " + average);
    }
}

