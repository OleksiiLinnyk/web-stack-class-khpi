package ua.edu.khpi.strategy;

import java.math.BigDecimal;

public class Product {

    private BigDecimal price;
    private Long quantity;

    public Product() {
    }

    public Product(BigDecimal price, Long quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
