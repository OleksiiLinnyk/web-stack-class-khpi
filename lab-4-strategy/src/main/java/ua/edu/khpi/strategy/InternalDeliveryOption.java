package ua.edu.khpi.strategy;

import java.math.BigDecimal;

public class InternalDeliveryOption implements Delivery {

    private static final BigDecimal INTERNAL_DELIVERY_COST_PER_QUANTITY = BigDecimal.valueOf(21.12);

    @Override
    public void deliveryCost(Product product) {
        BigDecimal totalDeliveryCost = INTERNAL_DELIVERY_COST_PER_QUANTITY.multiply(BigDecimal.valueOf(product.getQuantity()));
        System.out.println("Internal delivery cost " + totalDeliveryCost);
    }
}
