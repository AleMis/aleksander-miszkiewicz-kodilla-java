package challenges.exercise92;

public class PurchaseService implements Purchase {

    public void startOrderExecution(OrderRequest orderRequest) {
        System.out.println("Execution of order: " + orderRequest.getProduct() + " "
                                                  + orderRequest.getAmount()
                                                  + " was started!");
    }
}
