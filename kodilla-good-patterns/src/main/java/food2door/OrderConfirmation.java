package food2door;

public class OrderConfirmation {

    public void notifySupplier(PurchaserOrder order) {
        System.out.println("Order: Product - " + order.getProducts() + "; Quantity - "
                + order.getQuantity() + " was send to execution!");

    }

}
