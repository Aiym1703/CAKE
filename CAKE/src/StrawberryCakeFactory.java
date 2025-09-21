// Concrete factory for Strawberry Cake
public class StrawberryCakeFactory implements CakeFactory {
    public Cake createCake() {
        return new StrawberryCake();
    }
}
