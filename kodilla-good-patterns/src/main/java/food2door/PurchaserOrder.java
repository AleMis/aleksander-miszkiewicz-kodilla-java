package food2door;

public class PurchaserOrder {

    private Purchaser purchaser;
    private Supplier supplier;
    private Products product;
    private Integer quantity;

    public PurchaserOrder(Purchaser purchaser, Supplier supplier, Products product, Integer quantity) {
        this.purchaser = purchaser;
        this.supplier = supplier;
        this.product = product;
        this.quantity = quantity;
    }

    public Purchaser getPurchaser() {
        return purchaser;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Products getProducts() {
        return product;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
