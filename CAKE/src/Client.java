// Client class
public class Client {
    private final Cake cake;

    public Client(CakeFactory factory) {
        this.cake = factory.createCake();
    }

    public Cake getCake() {
        return cake;
    }
}
