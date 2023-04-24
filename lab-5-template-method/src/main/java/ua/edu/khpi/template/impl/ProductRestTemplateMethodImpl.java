package ua.edu.khpi.template.impl;

import ua.edu.khpi.api.RESTRequestApi;
import ua.edu.khpi.entity.Identifiable;
import ua.edu.khpi.entity.Product;
import ua.edu.khpi.template.AbstractRestTemplateMethod;

import java.math.BigDecimal;

public class ProductRestTemplateMethodImpl extends AbstractRestTemplateMethod {
    @Override
    protected Product parseRequest(RESTRequestApi restRequest) {
        return (Product) restRequest.getIdentifiableToUpdate();
    }

    @Override
    protected boolean validateEntity(Identifiable entity) {
        if (entity instanceof Product) {
            Product product = (Product) entity;
            return !product.getName().isEmpty() && (product.getPrice().compareTo(BigDecimal.ZERO) > 0);
        }
        return false;
    }

    @Override
    protected void afterValidate(Identifiable entity, boolean isValid) {
        if (!isValid && entity instanceof Product) {
            System.out.println("Sending request to administrator messenger. Validation failed");
        }
    }

    @Override
    protected boolean updateData(Identifiable entity) {
        if (entity instanceof Product) {
            Product product = (Product) entity;
            System.out.println("Updating product in db " + product);
            return true;
        }
        return false;
    }


    @Override
    protected String generateResponse(Identifiable entity, boolean isValid, boolean isUpdated) {
        if (entity instanceof Product) {
            if (!isValid) {
                return "Product " + entity + " did not pass validation";
            }
            if (!isUpdated) {
                return "Failed during product update";
            }
            return "Product was successfully updated";
        }
        throw new IllegalArgumentException("Wrong entity");
    }
}
