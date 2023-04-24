package ua.edu.khpi.template.impl;

import ua.edu.khpi.api.RESTRequestApi;
import ua.edu.khpi.entity.Identifiable;
import ua.edu.khpi.entity.Order;
import ua.edu.khpi.template.AbstractRestTemplateMethod;

import java.math.BigDecimal;

public class OrderRestTemplateMethodImpl extends AbstractRestTemplateMethod {

    @Override
    protected Identifiable parseRequest(RESTRequestApi restRequest) {
        return (Order) restRequest.getIdentifiableToUpdate();
    }

    @Override
    protected boolean validateEntity(Identifiable entity) {
        if (entity instanceof Order) {
            Order order = (Order) entity;
            return order.getOrderedBy() != null || !(order.getTotalPrice().compareTo(BigDecimal.ZERO) > 0);
        }
        return false;
    }

    @Override
    protected boolean updateData(Identifiable entity) {
        if (entity instanceof Order) {
            System.out.println("Updating order in storage");
            return true;
        }
        return false;
    }

    @Override
    protected String generateResponse(Identifiable entity, boolean isValid, boolean isUpdated) {
        if (entity instanceof Order) {
            if (!isValid) {
                return "Order did not pass validation";
            }
            if (!isUpdated) {
                return "Failed during Order update";
            }
            return "Order " + entity + " was successfully updated";
        }
        throw new IllegalArgumentException("Wrong entity");
    }
}
