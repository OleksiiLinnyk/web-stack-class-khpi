package ua.edu.khpi.strategy.init;

import ua.edu.khpi.DeliveryOption;
import ua.edu.khpi.strategy.Delivery;
import ua.edu.khpi.strategy.ExternalDeliveryOption;
import ua.edu.khpi.strategy.InternalDeliveryOption;
import ua.edu.khpi.strategy.SelfDeliveryOption;

import java.util.HashMap;
import java.util.Map;

public class DeliveryStrategy {

    private final Map<DeliveryOption, Delivery> deliveryOptionDeliveryMap = new HashMap<>();

    public DeliveryStrategy() {
        deliveryOptionDeliveryMap.put(DeliveryOption.SELF, new SelfDeliveryOption());
        deliveryOptionDeliveryMap.put(DeliveryOption.EXTERNAL, new ExternalDeliveryOption());
        deliveryOptionDeliveryMap.put(DeliveryOption.INTERNAL, new InternalDeliveryOption());
    }


    public Delivery getStrategy(DeliveryOption deliveryOption) {
        if (deliveryOptionDeliveryMap.containsKey(deliveryOption)) {
            return deliveryOptionDeliveryMap.get(deliveryOption);
        }
        throw new UnsupportedOperationException(String.format("Such delivery option %s does not supported", deliveryOption.name().toLowerCase()));
    }
}
