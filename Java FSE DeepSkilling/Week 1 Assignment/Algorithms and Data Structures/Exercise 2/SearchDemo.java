import java.util.Arrays;
import java.util.Comparator;

public class SearchDemo {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Mouse", "Electronics"),
            new Product(3, "Shoes", "Footwear"),
            new Product(4, "Keyboard", "Electronics")
        };

        linearSearch(products, "Mouse");

        Arrays.sort(products, new Comparator<Product>() {
            public int compare(Product a, Product b) {
                return a.productName.compareTo(b.productName);
            }
        });

        binarySearch(products, "Shoes");
    }

    public static void linearSearch(Product[] products, String name) {
        for (Product p : products) {
            if (p.productName.equals(name)) {
                System.out.println("Found (Linear): " + p.productName);
                return;
            }
        }
        System.out.println("Not found (Linear)");
    }

    public static void binarySearch(Product[] products, String name) {
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = products[mid].productName.compareTo(name);
            if (cmp == 0) {
                System.out.println("Found (Binary): " + products[mid].productName);
                return;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Not found (Binary)");
    }
}
