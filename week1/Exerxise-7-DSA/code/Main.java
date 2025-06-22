public class Main {
    public static void main(String[] args) {
        double principal = 1000.0;
        double annualGrowthRate = 0.05; // 5% annual growth
        int years = 10;

        double result = FinancialForecast.futureValue(principal, annualGrowthRate, years);
        System.out.println("Future Value after " + years + " years: " + result);
    }
}
