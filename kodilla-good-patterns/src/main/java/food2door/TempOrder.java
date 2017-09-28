package food2door;

public class TempOrder {


    public static PurchaserOrder createOrder() {
        Purchaser purchaser = new Purchaser("am@gmail.com", "Jan", "Nowak");
        Supplier supplier = new Supplier("ExtraFoodShop");
        Products products = new Products("Broccoli");
        Integer quantity = 10;
        return new PurchaserOrder(purchaser,supplier,products,quantity);
    }
}
