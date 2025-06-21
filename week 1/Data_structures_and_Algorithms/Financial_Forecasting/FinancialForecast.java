package Financial_Forecasting;

public class FinancialForecast {

public static double forecastRecursive(double initialValue, double[] rates, int yearIndex) {
        if (yearIndex == 0) {
            return initialValue;
        }
        double prev = forecastRecursive(initialValue, rates, yearIndex - 1);
        return prev * (1 + rates[yearIndex - 1]);
    }
public static double forecastMemo(double initialValue, double[] rates, int yearIndex, Double[] cache) {
        if (yearIndex == 0) {
            return initialValue;
        }
        if (cache[yearIndex] != null) {
            return cache[yearIndex];
        }
        double prev = forecastMemo(initialValue, rates, yearIndex - 1, cache);
        double curr = prev * (1 + rates[yearIndex - 1]);
        cache[yearIndex] = curr;
        return curr;
    }
public static double forecastIterative(double initialValue, double[] rates, int yearIndex) {
        double value = initialValue;
        for (int i = 0; i < yearIndex; i++) {
            value *= (1 + rates[i]);
        }
        return value;
    }
public static Double[] newCache(int years) {
        return new Double[years + 1];
    }
}
