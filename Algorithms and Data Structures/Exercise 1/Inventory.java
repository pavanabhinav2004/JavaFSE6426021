import java.util.HashMap;

public class Inventory {
    private HashMap<String, Product> products = new HashMap<String, Product>();

    public void addProduct(Product product) {
        products.put(product.productId, product);
    }

    public void updateProduct(String productId, int quantity, double price) {
        Product p = products.get(productId);
        if (p != null) {
            p.quantity = quantity;
            p.price = price;
        }
    }

    public void deleteProduct(String productId) {
        products.remove(productId);
    }

    public void display() {
        for (Product p : products.values()) {
            System.out.println(p.productName + " - " + p.quantity + " - " + p.price);
        }
    }
}
