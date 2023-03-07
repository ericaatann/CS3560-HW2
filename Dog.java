public class Dog {
    private String breed;
    private String name;
    private Paw[] paws;

    public Dog() {
        this.paws = new Paw[4];
        for(int i = 0; i < 4; i++) {
            this.paws[i] = new Paw(i);
        }
    }

    // Other methods for Dog class

}
