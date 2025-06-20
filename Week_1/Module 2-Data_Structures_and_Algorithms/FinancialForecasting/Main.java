package FinancialForecasting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Financial Forecasting Tool");
        System.out.print("Enter Initial Amount (Rs.): ");
        double amount = sc.nextDouble();

        System.out.print("Enter Annual Growth Rate (in %): ");
        double rate = sc.nextDouble() / 100.0; // Convert to decimal

        System.out.print("Enter Number of Years to Forecast: ");
        int years = sc.nextInt();

        double predictedValue = ForecastCalculator.predictFutureValue(years, amount, rate);
        System.out.printf("Predicted Value after %d years = Rs.%.2f%n", years, predictedValue);

        sc.close();
    }
}

