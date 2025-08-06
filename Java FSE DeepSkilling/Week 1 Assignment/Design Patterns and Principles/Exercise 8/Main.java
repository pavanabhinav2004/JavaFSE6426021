public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment());
        context.execute(1000);

        context.setStrategy(new PayPalPayment());
        context.execute(1500);
    }
}
