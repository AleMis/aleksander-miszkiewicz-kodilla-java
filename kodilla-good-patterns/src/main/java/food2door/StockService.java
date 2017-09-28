package food2door;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StockService {


    public Boolean checkAvailability(PurchaserOrder order) {
        HashMap<Products, ProductsParameters> products = SuppliersDatabase.createSuppliersDatabase().get(order.getSupplier());
        boolean isProduct = products.containsKey(order.getProducts());

        Boolean check = false;
        if (!SuppliersDatabase.createSuppliersDatabase().containsKey(order.getSupplier())) {
            check = false;
        } else {
            Integer quantity = checkQuantity(order);
            if (isProduct && quantity >= order.getQuantity()) {
                check = true;
            }
        }
        return check;
    }

    public Integer checkQuantity(PurchaserOrder order) {
        List<Integer> list = SuppliersDatabase.createSuppliersDatabase().get(order.getSupplier()).entrySet().stream()
                .filter(product -> product.getKey().equals(order.getProducts()))
                .map(Map.Entry::getValue)
                .map(amount -> amount.getQuantity())
                .collect(Collectors.toList());

        Integer quantity = list.get(0);

        return quantity;
    }
}


