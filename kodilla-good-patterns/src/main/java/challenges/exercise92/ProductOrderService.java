package challenges.exercise92;

public class ProductOrderService {

    private WarehouseService warehouseService;
    private ConfirmationService confirmationService;
    private PurchaseService purchaseService;

    public ProductOrderService(WarehouseService warehouseService, ConfirmationService confirmationService, PurchaseService purchaseService) {
        this.warehouseService = warehouseService;
        this.confirmationService = confirmationService;
        this.purchaseService = purchaseService;
    }

    public OrderExecution process(final OrderRequest orderRequest) {
        boolean isAvailable = warehouseService.checkAvailability(orderRequest);

        if(isAvailable) {
            confirmationService.informClient(orderRequest);
            purchaseService.startOrderExecution(orderRequest);
            return new OrderExecution(orderRequest, true);
        }else {
            return new OrderExecution(orderRequest, false);
        }
    }
}
