public class StrawberryDessertFactory implements DessertFactory {
    public Cake createCake() {
        return new StrawberryCake();
    }
    public Drink createDrink() {
        return new Tea();
    }
}
