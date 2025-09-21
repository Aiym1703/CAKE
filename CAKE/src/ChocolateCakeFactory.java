// Concrete factory for Chocolate Cake
public class ChocolateCakeFactory implements CakeFactory {
    public Cake createCake() {
        return new ChocolateCake();
    }
}
