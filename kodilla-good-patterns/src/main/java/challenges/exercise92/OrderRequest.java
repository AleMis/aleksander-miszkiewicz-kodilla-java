package challenges.exercise92;

public class OrderRequest {

    private Client client;
    private Product product;
    private int amount;

    public OrderRequest(Client client, Product product, int amount) {
        this.client = client;
        this.product = product;
        this.amount = amount;
    }

    public Client getClient() {
        return client;
    }

    public Product getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }
}
