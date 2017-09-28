package food2door;

public class SupplierNotification {

    public void notifySupplier(PurchaserOrder order) {
        System.out.println("Order: " + order.getSupplier() + " "
                                     + order.getProducts() + " "
                                     + order.getQuantity() + " was submitted to execution!");

    }
}
