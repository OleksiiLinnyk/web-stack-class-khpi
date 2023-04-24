package ua.edu.khpi.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Order implements Identifiable{

    private Integer id;
    private LocalDateTime orderedTime;
    private BigDecimal totalPrice;
    private User orderedBy;

    public Order() {
    }

    public Order(Integer id, LocalDateTime orderedTime, BigDecimal totalPrice, User orderedBy) {
        this.id = id;
        this.orderedTime = orderedTime;
        this.totalPrice = totalPrice;
        this.orderedBy = orderedBy;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getOrderedTime() {
        return orderedTime;
    }

    public void setOrderedTime(LocalDateTime orderedTime) {
        this.orderedTime = orderedTime;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public User getOrderedBy() {
        return orderedBy;
    }

    public void setOrderedBy(User orderedBy) {
        this.orderedBy = orderedBy;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderedTime=" + orderedTime +
                ", totalPrice=" + totalPrice +
                ", orderedBy=" + orderedBy +
                '}';
    }
}
