public class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier wrapped) {
        super(wrapped);
    }

    public void send(String message) {
        wrapped.send(message);
        System.out.println("SMS: " + message);
    }
}
