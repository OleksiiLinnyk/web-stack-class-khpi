package ua.edu.khpi.template;

import ua.edu.khpi.api.RESTRequestApi;
import ua.edu.khpi.entity.Identifiable;

public abstract class AbstractRestTemplateMethod {

    public String processRestRequest(RESTRequestApi restRequest) {
        boolean isValid = false;
        boolean isUpdated = false;

        Identifiable entity = restRequest.getIdentifiableToUpdate();

        beforeValidate(entity);
        isValid = validateEntity(entity);
        afterValidate(entity, isValid);

        if (isValid) {
            beforeUpdate(entity);
            isUpdated = updateData(entity);
            afterUpdate(entity, isUpdated);
        }
        return generateResponse(entity, isValid, isUpdated);
    }

    protected void beforeValidate(Identifiable entity) {
        // empty hook
    }

    protected void afterValidate(Identifiable entity, boolean isValid) {
        // empty hook
    }

    protected void beforeUpdate(Identifiable entity) {
        // empty hook
    }

    protected void afterUpdate(Identifiable entity, boolean isUpdated) {
        // empty hook
    }

    protected abstract Identifiable parseRequest(RESTRequestApi restRequest);

    protected abstract boolean validateEntity(Identifiable entity);

    protected abstract boolean updateData(Identifiable entity);

    protected abstract String generateResponse(Identifiable entity, boolean isValid, boolean isUpdated);
}
