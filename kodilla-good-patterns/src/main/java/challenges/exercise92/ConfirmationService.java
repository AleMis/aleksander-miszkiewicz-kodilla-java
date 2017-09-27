package challenges.exercise92;

public class ConfirmationService implements Confirmation{

    public void informClient(OrderRequest orderRequest) {
        System.out.println("Confirmation was send to client: " + orderRequest.getClient().getFirstName() + " "
                                                                + orderRequest.getClient().getLastName() + " "
                                                                + orderRequest.getClient().getEmail()
                            +  "\nOrder: " + orderRequest.getProduct() + " ; " + "quantity: " + orderRequest.getAmount());
    }
}
