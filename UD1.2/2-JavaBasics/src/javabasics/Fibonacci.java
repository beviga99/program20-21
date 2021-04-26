package javabasics;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 3;          
        int fn;            
        int fnMinus1 = 1;  
        int fnMinus2 = 1;   
        int nMax = 20;    
        int sum = fnMinus1 + fnMinus2; 
        double average;

        System.out.println("The first " + nMax + " Fibonacci numbers are:");
        System.out.println(fnMinus1);
        System.out.println(fnMinus2);

        while (n <= nMax) {

            fn = fnMinus1 + fnMinus2;
            sum += fn;
            System.out.println(fn);

            ++n;
            fnMinus1 = fnMinus2;
            fnMinus2 = fn;
        }
        average = (double)sum / nMax;
        System.out.println("The average of Fibonacci numbers is: " + average);
    } 
}