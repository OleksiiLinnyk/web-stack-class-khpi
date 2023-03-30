package ua.edu.khpi.strategy;

import java.math.BigDecimal;

public class SelfDeliveryOption implements Delivery {


    @Override
    public void deliveryCost(Product product) {
        System.out.println("Self delivery is free");
    }
}
