public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        market.register(mobile);
        market.register(web);

        market.setStockData("AAPL", 193.5);
        market.setStockData("GOOG", 2823.7);
    }
}
