package lab16;

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    // Constructor
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    // Accessor methods
    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    // Mutator methods
    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    // Method to calculate change percent
    public double changePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }

    public static void main(String[] args) {
        // Google Stock
        Stock google = new Stock("GOOG", "Google Inc.");
        google.setPreviousClosingPrice(1000);
        google.setCurrentPrice(2000);
        System.out.println("Google Inc. price-change percentage: " + google.changePercent() + "%");

        // Facebook Stock
        Stock facebook = new Stock("FB", "Facebook Inc.");
        facebook.setPreviousClosingPrice(300); // Set a realistic previous closing price
        facebook.setCurrentPrice(320); // Set a realistic current price
        System.out.println("Facebook Inc. price-change percentage: " + facebook.changePercent() + "%");

        // Amazon Stock
        Stock amazon = new Stock("AMZN", "Amazon Inc.");
        amazon.setPreviousClosingPrice(3500); // Set a realistic previous closing price
        amazon.setCurrentPrice(3600); // Set a realistic current price
        System.out.println("Amazon Inc. price-change percentage: " + amazon.changePercent() + "%");
    }
}
