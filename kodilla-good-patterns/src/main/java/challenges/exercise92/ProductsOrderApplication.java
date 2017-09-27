package challenges.exercise92;

public class ProductsOrderApplication {

    public static void main(String args[]) {

        WarehouseService warehouseService = new WarehouseService();
        PurchaseService purchaseService = new PurchaseService();
        ConfirmationService confirmationService = new ConfirmationService();

        Order order = new Order();
        OrderRequest orderRequest = order.createOrder();

        ProductOrderService productOrderService = new ProductOrderService(warehouseService, confirmationService, purchaseService);
        productOrderService.process(orderRequest);

    }
}
