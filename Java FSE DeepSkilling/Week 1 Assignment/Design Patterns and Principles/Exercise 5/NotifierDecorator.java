public abstract class NotifierDecorator implements Notifier {
    protected Notifier wrapped;

    public NotifierDecorator(Notifier wrapped) {
        this.wrapped = wrapped;
    }
}
