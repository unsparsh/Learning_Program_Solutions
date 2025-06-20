package Code;

public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileUser1 = new MobileApp("Sparsh");
        Observer webUser1 = new WebApp("InvestorX");

        stockMarket.registerObserver(mobileUser1);
        stockMarket.registerObserver(webUser1);

        stockMarket.setStockPrice(101.5);
        stockMarket.setStockPrice(98.75);

        stockMarket.removeObserver(webUser1);
        stockMarket.setStockPrice(95.0); // Only mobile user gets notified now
    }
}
