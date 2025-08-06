public class SlackNotifierDecorator extends NotifierDecorator {
    public SlackNotifierDecorator(Notifier wrapped) {
        super(wrapped);
    }

    public void send(String message) {
        wrapped.send(message);
        System.out.println("Slack: " + message);
    }
}
