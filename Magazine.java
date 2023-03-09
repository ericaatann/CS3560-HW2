public class Magazine implements SaleableItem {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public void sellCopy() {
        System.out.println("Selling a magazine: " + this.title);
        throw new UnsupportedOperationException("Unimplemented method 'sellCopy'");
    }
}


