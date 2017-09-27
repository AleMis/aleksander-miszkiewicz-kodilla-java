package challenges.exercise92;

public class Order {

    public OrderRequest createOrder() {
        Client client = new Client("am@gmail.com", "Adam", "Mickiewicz");
        Product product = new Product("Logitech", 100.0);
        return new OrderRequest(client, product, 5);
    }
}
