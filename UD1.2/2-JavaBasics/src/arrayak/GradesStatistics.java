package arrayak;

import java.util.Scanner;

public class GradesStatistics {

    public static void main(String[] args) {

        int[] grades;
        float average = 0;
        int minimum = 100;
        int maximum = 0;
        int sum = 0;
        int numStudents;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        numStudents = in.nextInt();

        grades = new int[numStudents];

        for (int i = 0; i < grades.length; ++i) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = in.nextInt();

            sum += grades[i];
        }

        for (int n = 0; n < numStudents; n++) {
            
            if (minimum > grades[n]) {
                minimum = grades[n];
            }
        }
        for (int n = 0; n < numStudents; n++) {
           
            if (maximum < grades[n]) {
                maximum = grades[n];
            }
        }
        average = (float) sum / grades.length;
        System.out.println("The average is: " + average);
        System.out.println("The minimum is: " + minimum);
        System.out.println("The maximum is: " + maximum);
        System.out.println();
    }
}
