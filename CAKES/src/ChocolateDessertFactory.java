public class ChocolateDessertFactory implements DessertFactory {
    public Cake createCake() {
        return new ChocolateCake();
    }
    public Drink createDrink() {
        return new Coffee();
    }
}
