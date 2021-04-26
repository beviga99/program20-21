package Metodoak;

import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics {

    public static int[] grades;

    public static void main(String[] args) {

        readGrades();
        System.out.println("The grades are: ");
        print(grades);
        System.out.println("The average is " + average(grades));
        System.out.println("The median is " + median(grades));
        System.out.println("The minimum is " + min(grades));
        System.out.println("The maximum is " + max(grades));
        System.out.printf("The standard deviation is: %.2f", stdDev(grades));
    }

    public static void readGrades() {
        int NStudents;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        NStudents = in.nextInt();

        grades = new int[NStudents];
        for (int n = 0; n < NStudents; n++) {
            System.out.print("Enter the grade for student (0-100)" + (n + 1) + ": ");
            grades[n] = in.nextInt();
        }
    }

    public static void print(int[] array) {

        System.out.print("[");
        for (int n = 0; n < array.length; n++) {
            if (n < array.length - 1) {
                System.out.print(array[n] + ", ");
            } else {
                System.out.print(array[n] + "].");
            }
        }
        System.out.println();
    }

    public static double average(int[] array) {
        int sum = 0;
        for (int n = 0; n < array.length; n++) {
            sum += array[n];
        }
        double average = (double) sum / array.length;
        return average;
    }

    public static double median(int[] array) {
        Arrays.sort(array);
        double median;
        int middleN = array.length / 2;
        if (array.length % 2 == 0) {
            median = (double) ((array[middleN-1] + array[middleN])) / 2;
        } else {
            median = array[middleN];
        }
        return median;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int n = 0; n < array.length; n++) {
            if (array[n] > max) {
                max = array[n];
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int n = 0; n < array.length; n++) {
            if (array[n] < min) {
                min = array[n];
            }
        }
        return min;
    }

    public static double stdDev(int[] array) {
        double stdDev;
        double D = 0;
        for (int n = 0; n < array.length; n++) {
            D += (array[n] - average(array)) * (array[n] - average(array));
        }
        stdDev = Math.sqrt(D / array.length);
        return stdDev;
    }
}
