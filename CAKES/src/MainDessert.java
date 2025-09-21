public class MainDessert {
    public static void main(String[] args) {
        DessertFactory chocoFactory = new ChocolateDessertFactory();
        ClientAF chocoClient = new ClientAF(chocoFactory);
        chocoClient.serveDessert();

        DessertFactory strawberryFactory = new StrawberryDessertFactory();
        ClientAF strawberryClient = new ClientAF(strawberryFactory);
        strawberryClient.serveDessert();
    }
}

