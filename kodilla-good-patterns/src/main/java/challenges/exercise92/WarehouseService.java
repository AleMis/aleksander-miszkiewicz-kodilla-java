package challenges.exercise92;

public class WarehouseService implements Warehouse{

    public boolean checkAvailability(OrderRequest orderRequest) {
        boolean check = false;
        boolean contain = ProductsDatabase.createProductDatabase().containsKey(orderRequest.getProduct());
        int amount = ProductsDatabase.createProductDatabase().get(orderRequest.getProduct());

        if(contain && amount>=orderRequest.getAmount()) {
                check = true;
        }
        return check;
    }
}
