package com.ps;

public class Main {
    public static void main(String[] args) {

        double principal = 84000.0;
        double annualInterestRate = 0.085;
        int loanTermYears = 10;

        // Calculate monthly interest rate //
        double monthlyInterestRate = annualInterestRate / 12.0;

        // Calculate total numbers of months //
        int numbersOfMonths = loanTermYears * 12;

        // Calculate the monthly payment using the formula //
        double monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numbersOfMonths)) / (Math.pow(1 + monthlyInterestRate, numbersOfMonths) - 1);

        // Calculate the total amount paid //
        double totalAmountPaid = monthlyPayment * numbersOfMonths;

        // Calculate the total interest paid //
        double totalInterestPaid = totalAmountPaid - principal;

        System.out.printf("Loan Principal: $% .2f%n", principal);
        System.out.printf("Annual Interest Rate: % .3f%%%n", annualInterestRate * 100);
        System.out.printf("Loan Term: %d years (%d months)%n", loanTermYears, numbersOfMonths);
        System.out.printf("Monthly Payment: $% .2f%n", monthlyPayment);
        System.out.printf("Total Interest Paid: $% .2f%n", totalInterestPaid);


    }
}