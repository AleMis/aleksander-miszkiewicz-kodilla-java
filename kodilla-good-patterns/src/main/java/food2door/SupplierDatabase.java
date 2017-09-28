package food2door;

import java.math.BigDecimal;
import java.util.HashMap;

public class SupplierDatabase {

    public static HashMap<Products, ProductsParameters> createExtraFoodShopDatabase() {
        Products broccoli = new Products("Broccoli");
        ProductsParameters broccoliParameters = new ProductsParameters(new BigDecimal("3.00"), 100);

        Products peas = new Products("Peas");
        ProductsParameters peasParameters = new ProductsParameters(new BigDecimal("5.00"), 50);

        Products carrot = new Products("Carrot");
        ProductsParameters carrotParameters = new ProductsParameters(new BigDecimal("2.00"), 200);

        ProductsDatabase productsDatabase = new ProductsDatabase();
        HashMap<Products, ProductsParameters> database = productsDatabase.createProductsDatabase();
        database.put(broccoli, broccoliParameters);
        database.put(peas, peasParameters);
        database.put(carrot, carrotParameters);

        return database;
    }

    public static HashMap<Products, ProductsParameters> createHealthyShop() {
        Products cauliflower = new Products("Cauliflower");
        ProductsParameters caulifloweParameters = new ProductsParameters(new BigDecimal("3.50"), 70);

        Products sweatPotato = new Products("Sweat Potato");
        ProductsParameters sweatPotatoParameters = new ProductsParameters(new BigDecimal("8.00"), 30);

        Products apple = new Products("Apple");
        ProductsParameters appleParameters = new ProductsParameters(new BigDecimal("4.00"), 150);

        ProductsDatabase productsDatabase = new ProductsDatabase();
        HashMap<Products, ProductsParameters> database = productsDatabase.createProductsDatabase();
        database.put(cauliflower, caulifloweParameters);
        database.put(sweatPotato, sweatPotatoParameters);
        database.put(apple, appleParameters);

        return database;
    }

    public static HashMap<Products, ProductsParameters> createGlutenFreeShop() {
        Products flour = new Products("Flour");
        ProductsParameters flourParameters = new ProductsParameters(new BigDecimal("4.50"), 100);

        Products pasta = new Products("Pasta");
        ProductsParameters pastaParameters = new ProductsParameters(new BigDecimal("5.50"), 50);

        Products bread  = new Products("Bread");
        ProductsParameters breadParameters = new ProductsParameters(new BigDecimal("4.00"), 40);

        ProductsDatabase productsDatabase = new ProductsDatabase();
        HashMap<Products, ProductsParameters> database = productsDatabase.createProductsDatabase();
        database.put(flour, flourParameters);
        database.put(pasta, pastaParameters);
        database.put(bread, breadParameters);

        return database;
    }




}
