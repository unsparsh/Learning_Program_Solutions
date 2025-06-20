package FinancialForecasting;

public class ForecastCalculator {

    // Recursive method
    public static double predictFutureValue(int years, double initialAmount, double growthRate) {
        if (years == 0) return initialAmount;

        // Recursive call
        double previousYear = predictFutureValue(years - 1, initialAmount, growthRate);
        return previousYear * (1 + growthRate);
    }
}

