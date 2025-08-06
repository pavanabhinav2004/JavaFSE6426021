public class Forecast {

    public static double predictFutureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return predictFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static double predictFutureValueOptimized(double currentValue, double growthRate, int years) {
        return currentValue * Math.pow(1 + growthRate, years);
    }

    public static void main(String[] args) {
        double currentValue = 1000.0;
        double growthRate = 0.05;
        int years = 5;

        double recursivePrediction = predictFutureValue(currentValue, growthRate, years);
        double optimizedPrediction = predictFutureValueOptimized(currentValue, growthRate, years);

        System.out.println("Recursive Prediction: " + recursivePrediction);
        System.out.println("Optimized Prediction: " + optimizedPrediction);
    }
}
