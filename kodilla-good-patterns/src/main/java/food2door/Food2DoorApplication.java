package food2door;

public class Food2DoorApplication {

    public static void main(String args[]) {

        StockService stockService = new StockService();
        SupplierNotification supplierNotification = new SupplierNotification();
        PurchaserNotification purchaserNotification = new PurchaserNotification();
        OrderConfirmation orderConfirmation = new OrderConfirmation();

        PurchaserOrder order = TempOrder.createOrder();

        OrderProcess orderProcess = new OrderProcess(stockService, supplierNotification, purchaserNotification, orderConfirmation);
        orderProcess.process(order);
    }
}
