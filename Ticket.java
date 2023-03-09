public class Ticket implements SaleableItem {
    private String eventName;

    public Ticket(String eventName) {
        this.eventName = eventName;
    }

    @Override
    public void sellCopy() {
        throw new UnsupportedOperationException("Unimplemented method 'sellCopy'");
    }
}