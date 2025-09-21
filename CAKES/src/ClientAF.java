public class ClientAF {
    private final Cake cake;
    private final Drink drink;

    public ClientAF(DessertFactory factory) {
        this.cake = factory.createCake();
        this.drink = factory.createDrink();
    }

    public void serveDessert() {
        cake.printCake();
        drink.printDrink();
    }
}
