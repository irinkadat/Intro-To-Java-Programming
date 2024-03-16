package chapter_9.exercise_2;

public class Stock {
        private String symbol;
        private String name;
        private double previousPrice;
        private double currentPrice;

        public Stock(String symbol, String name) {
            this.symbol = symbol;
            this.name = name;
        }

        public double getChangePercent() {
            return ((currentPrice - previousPrice) / previousPrice) * 100.0;
        }

        public void setPreviousPrice(double previousPrice) {
            this.previousPrice = previousPrice;
        }

        public void setCurrentPrice(double currentPrice) {
            this.currentPrice = currentPrice;
        }
}
