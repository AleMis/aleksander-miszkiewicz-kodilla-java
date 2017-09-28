package food2door;

import java.math.BigDecimal;

public class ProductsParameters {

    private BigDecimal price;
    private Integer quantity;

    public ProductsParameters(BigDecimal price, Integer quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
