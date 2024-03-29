package javabasics;

import java.util.Scanner;

public class PensionContributionCalculator {

    public static void main(String[] args) {
        final int SALARY_CEILING = 6000;
        final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
        final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
        final double EMPLOYEE_RATE_55_TO_60 = 0.13;
        final double EMPLOYER_RATE_55_TO_60 = 0.13;
        final double EMPLOYEE_RATE_60_TO_65 = 0.075;
        final double EMPLOYER_RATE_60_TO_65 = 0.09;
        final double EMPLOYEE_RATE_65_ABOVE = 0.05;
        final double EMPLOYER_RATE_65_ABOVE = 0.075;

        int salary, age;
        double contributableSalary;
        double employeeContribution, employerContribution, totalContribution;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the monthly salary: $");
        salary = in.nextInt();
        System.out.print("Enter the age: ");
        age = in.nextInt();

        contributableSalary = SALARY_CEILING;

        contributableSalary = SALARY_CEILING;
        if (salary > 6000) {
            salary = 6000;
            if (age <= 55) {
                employeeContribution = (double) salary * EMPLOYEE_RATE_55_AND_BELOW;
                employerContribution = (double) salary * EMPLOYER_RATE_55_AND_BELOW;
                totalContribution = (double) employeeContribution + employerContribution;
            } else if (age <= 60) {
                employeeContribution = (double) salary * EMPLOYEE_RATE_55_TO_60;
                employerContribution = (double) salary * EMPLOYER_RATE_55_TO_60;
                totalContribution = (double) employeeContribution + employerContribution;
            } else if (age <= 65) {
                employeeContribution = (double) salary * EMPLOYEE_RATE_60_TO_65;
                employerContribution = (double) salary * EMPLOYER_RATE_60_TO_65;
                totalContribution = (double) employeeContribution + employerContribution;
            } else {
                employeeContribution = (double) salary * EMPLOYEE_RATE_65_ABOVE;
                employerContribution = (double) salary * EMPLOYER_RATE_65_ABOVE;
                totalContribution = (double) employeeContribution + employerContribution;
            }
        } else {

            if (age <= 55) {
                employeeContribution = (double) salary * EMPLOYEE_RATE_55_AND_BELOW;
                employerContribution = (double) salary * EMPLOYER_RATE_55_AND_BELOW;
                totalContribution = (double) employeeContribution + employerContribution;
            } else if (age <= 60) {
                employeeContribution = (double) salary * EMPLOYEE_RATE_55_TO_60;
                employerContribution = (double) salary * EMPLOYER_RATE_55_TO_60;
                totalContribution = (double) employeeContribution + employerContribution;
            } else if (age <= 65) {
                employeeContribution = (double) salary * EMPLOYEE_RATE_60_TO_65;
                employerContribution = (double) salary * EMPLOYER_RATE_60_TO_65;
                totalContribution = (double) employeeContribution + employerContribution;
            } else {
                employeeContribution = (double) salary * EMPLOYEE_RATE_65_ABOVE;
                employerContribution = (double) salary * EMPLOYER_RATE_65_ABOVE;
                totalContribution = (double) employeeContribution + employerContribution;
            }
        }
        
        in.close();
        System.out.printf("The employee's contribution is: $%.2f%n", employeeContribution);
        System.out.printf("The employer's contribution is: $%.2f%n", employerContribution);
        System.out.printf("The total contribution is: $%.2f%n", totalContribution);

    }
}
