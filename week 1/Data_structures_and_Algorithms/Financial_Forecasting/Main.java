package Financial_Forecasting;

public class Main {
    public static void main(String[] args) {
        double initialValue = 1000.0;
        double[] growthRates = { 0.05, 0.04, 0.06, 0.03 }; 
        int targetYear = 4;

        double rec = FinancialForecast.forecastRecursive(initialValue, growthRates, targetYear);
        System.out.printf("Recursive → Year %d: %.2f%n", targetYear, rec);

        Double[] cache = FinancialForecast.newCache(targetYear);
        double memo = FinancialForecast.forecastMemo(initialValue, growthRates, targetYear, cache);
        System.out.printf("Memoized → Year %d: %.2f%n", targetYear, memo);

        double iter = FinancialForecast.forecastIterative(initialValue, growthRates, targetYear);
        System.out.printf("Iterative → Year %d: %.2f%n", targetYear, iter);
    }
}
