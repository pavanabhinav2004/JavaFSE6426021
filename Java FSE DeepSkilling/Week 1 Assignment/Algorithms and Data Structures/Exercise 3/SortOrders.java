public class SortOrders {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(101, "Alice", 250.0),
            new Order(102, "Bob", 100.0),
            new Order(103, "Charlie", 300.0)
        };

        System.out.println("Bubble Sort:");
        bubbleSort(orders.clone());

        System.out.println("Quick Sort:");
        quickSort(orders, 0, orders.length - 1);
        for (Order o : orders) {
            System.out.println(o.orderId + " " + o.customerName + " " + o.totalPrice);
        }
    }

    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (orders[j].totalPrice > orders[j + 1].totalPrice) {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
        for (Order o : orders) {
            System.out.println(o.orderId + " " + o.customerName + " " + o.totalPrice);
        }
    }

    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    public static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].totalPrice;
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (orders[j].totalPrice < pivot) {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;
        return i + 1;
    }
}
