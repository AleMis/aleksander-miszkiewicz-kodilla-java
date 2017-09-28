package food2door;

public class PurchaserNotification {
    public void notifyPurchaser(PurchaserOrder order) {
        System.out.println("Order: Supplier - " + order.getSupplier() + "; Product - "
                                     + order.getProducts() + "; Quantity - "
                                     + order.getQuantity() + "; was send to execution!");

    }

    public void negativeResponse(PurchaserOrder order) {
        System.out.println("Order: Supplier -" + order.getSupplier() + "  Product - "
                                     + order.getProducts() + " Quantity - "
                                     + order.getQuantity() + "; can not be execute!");

    }
}
