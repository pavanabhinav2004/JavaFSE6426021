import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<Observer>();
    private String symbol;
    private double price;

    public void setStockData(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
        notifyObservers();
    }

    public void register(Observer o) {
        observers.add(o);
    }

    public void deregister(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(symbol, price);
        }
    }
}
