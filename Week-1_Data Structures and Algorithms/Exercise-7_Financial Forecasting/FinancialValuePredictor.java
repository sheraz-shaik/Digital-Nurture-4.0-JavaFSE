import java.util.*;

public class FinancialValuePredictor {

    private static Map<Integer, Double> valueCache = new HashMap<>();

    // Recursive method to calculate projected value with memoization
    public static double forecastFutureValue(double baseAmount, double interestRate, int numYears) {
        if (valueCache.containsKey(numYears)) {
            return valueCache.get(numYears);
        }

        // Base case: zero years remaining
        if (numYears == 0) {
            return baseAmount;
        }

        // Recursive calculation with caching
        double calculatedValue = forecastFutureValue(baseAmount * (1 + interestRate), interestRate, numYears - 1);
        valueCache.put(numYears, calculatedValue);
        return calculatedValue;
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("=== Financial Value Forecast Tool ===");

        // Getting financial inputs from user
        System.out.print("Enter the principal amount: ");
        double principalAmount = inputScanner.nextDouble();

        System.out.print("Enter the annual interest rate (as decimal): ");
        double annualRate = inputScanner.nextDouble();

        System.out.print("Enter the investment duration in years: ");
        int investmentYears = inputScanner.nextInt();

        double estimatedValue = forecastFutureValue(principalAmount, annualRate, investmentYears);
        System.out.printf("Projected Future Value: %.2f%n", estimatedValue);

        inputScanner.close();
    }
}
