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
        float monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) / (Math.pow(1 + monthlyInterestRate, numbersOfMonths) - 1);




    }
}