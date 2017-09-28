package food2door;

public class Products {

    private String productName;

    public Products(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return  productName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Products products = (Products) o;

        return productName.equals(products.productName);
    }

    @Override
    public int hashCode() {
        return productName.hashCode();
    }
}
