package javabasics;

public class Product1ToN2 {

    public static void main(String[] args) {

        long product = 1;
        int lowerbound = 1;
        int upperbound = 13;

        for (int number = lowerbound; number <= upperbound; ++number) {
            product *= number;
        }

        System.out.println("The product of numbers is: " + product);
    }
}

