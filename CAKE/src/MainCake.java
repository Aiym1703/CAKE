// Driver program
public class MainCake {
    public static void main(String[] args) {
        CakeFactory chocoFactory = new ChocolateCakeFactory();
        Client chocoClient = new Client(chocoFactory);
        Cake chocoCake = chocoClient.getCake();
        chocoCake.printCake();

        CakeFactory strawberryFactory = new StrawberryCakeFactory();
        Client strawberryClient = new Client(strawberryFactory);
        Cake strawberryCake = strawberryClient.getCake();
        strawberryCake.printCake();
    }
}
