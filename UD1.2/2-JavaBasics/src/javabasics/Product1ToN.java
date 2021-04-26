package javabasics;

public class Product1ToN {

    public static void main(String[] args) {

        int product = 1;
        int lowerbound = 1;
        int upperbound = 10;

        for (int number = lowerbound; number <= upperbound; ++number) {
            product *= number;
        }

        System.out.println("The product of numbers is: " + product);
    }
}
