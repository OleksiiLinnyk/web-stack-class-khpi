package ua.edu.khpi.strategy;

import java.math.BigDecimal;

public class ExternalDeliveryOption implements Delivery {

    private static final BigDecimal EXTERNAL_DELIVERY_PRICE_COST_PER_QUANTITY = BigDecimal.TEN;

    @Override
    public void deliveryCost(Product product) {
        BigDecimal totalDeliveryCost = EXTERNAL_DELIVERY_PRICE_COST_PER_QUANTITY.multiply(BigDecimal.valueOf(product.getQuantity()));
        System.out.println("External delivery cost " + totalDeliveryCost);
    }
}
