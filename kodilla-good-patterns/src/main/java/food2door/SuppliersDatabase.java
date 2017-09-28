package food2door;

import java.util.HashMap;

public class SuppliersDatabase {

    private static HashMap<Supplier, HashMap<Products, ProductsParameters>> suppliersDatabase = new HashMap<>();

    public static HashMap<Supplier, HashMap<Products, ProductsParameters>> createSuppliersDatabase() {
        Supplier extraFoodShoop = new Supplier("ExtraFoodShop");
        Supplier healthyShop = new Supplier("HealthyShop");
        Supplier glutenFreeShop = new Supplier("GlutenFreeShop");

        suppliersDatabase.put(extraFoodShoop, SupplierDatabase.createExtraFoodShopDatabase());
        suppliersDatabase.put(healthyShop, SupplierDatabase.createHealthyShop());
        suppliersDatabase.put(glutenFreeShop, SupplierDatabase.createGlutenFreeShop());

        return suppliersDatabase;
    }
}
