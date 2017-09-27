package challenges.exercise92;

import java.util.HashMap;

public class ProductsDatabase {


    private static HashMap<Product, Integer> database = new HashMap<>();


    public static HashMap<Product, Integer> createProductDatabase() {
        Product monitor = new Product("HP", 500.0);
        Product notebook = new Product("Dell", 3000.0);
        Product mouse = new Product("Logitech", 100.0);

        database.put(monitor, 10);
        database.put(notebook, 20);
        database.put(mouse,50);

        return database;
   }
}
