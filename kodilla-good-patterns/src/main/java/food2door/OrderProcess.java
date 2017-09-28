package food2door;

public class OrderProcess {

    private StockService stockService;
    private SupplierNotification supplierNotification;
    private PurchaserNotification purchaserNotification;
    private OrderConfirmation orderConfirmation;

    public OrderProcess(StockService stockService,
                        SupplierNotification supplierNotification,
                        PurchaserNotification purchaserNotification,
                        OrderConfirmation orderConfirmation) {
        this.stockService = stockService;
        this.supplierNotification = supplierNotification;
        this.purchaserNotification = purchaserNotification;
        this.orderConfirmation = orderConfirmation;
    }

    public void process(PurchaserOrder order) {
        boolean isAvailable = stockService.checkAvailability(order);

        if(isAvailable) {
            supplierNotification.notifySupplier(order);
            purchaserNotification.notifyPurchaser(order);
            orderConfirmation.notifySupplier(order);
        }else {
            purchaserNotification.negativeResponse(order);
        }

    }


}
