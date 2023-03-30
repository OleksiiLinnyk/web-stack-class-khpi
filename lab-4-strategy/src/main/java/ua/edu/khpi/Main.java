package ua.edu.khpi;

import ua.edu.khpi.strategy.Delivery;
import ua.edu.khpi.strategy.Product;
import ua.edu.khpi.strategy.init.DeliveryStrategy;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        DeliveryStrategy deliveryStrategy = new DeliveryStrategy();

        Delivery selfDelivery = deliveryStrategy.getStrategy(DeliveryOption.SELF);
        selfDelivery.deliveryCost(new Product(BigDecimal.TEN, 12L));
        //Self delivery is free

        Delivery externalDelivery = deliveryStrategy.getStrategy(DeliveryOption.EXTERNAL);
        externalDelivery.deliveryCost(new Product(BigDecimal.valueOf(12.3), 5L));
        //External delivery cost 50

        Delivery internalDelivery = deliveryStrategy.getStrategy(DeliveryOption.INTERNAL);
        internalDelivery.deliveryCost(new Product(BigDecimal.valueOf(45), 7L));
        //Internal delivery cost 147.84
    }
}
