package ua.edu.khpi.template.impl;

import ua.edu.khpi.api.RESTRequestApi;
import ua.edu.khpi.entity.Identifiable;
import ua.edu.khpi.entity.User;
import ua.edu.khpi.template.AbstractRestTemplateMethod;

public class UserRestTemplateMethodImpl extends AbstractRestTemplateMethod {

    @Override
    protected User parseRequest(RESTRequestApi restRequest) {
        return (User) restRequest.getIdentifiableToUpdate();
    }

    @Override
    protected boolean validateEntity(Identifiable entity) {
        if (entity instanceof User) {
            User user = (User) entity;
            return (!user.getFirstName().isEmpty() && !user.getLastName().isEmpty()) || !user.getPassword().isEmpty();
        }
        return false;
    }

    @Override
    protected void beforeUpdate(Identifiable entity) {
        if (entity instanceof User) {
            System.out.println("Remove user email from updating entity");
            User user = (User) entity;
            user.setEmail(null);
        }
    }

    @Override
    protected boolean updateData(Identifiable entity) {
        if (entity instanceof User) {
            User user = (User) entity;
            System.out.println("Updating user " + user);
            return true;
        }
        return false;
    }

    @Override
    protected String generateResponse(Identifiable entity, boolean isValid, boolean isUpdated) {
        if (entity instanceof User) {
            if (!isValid) {
                return "User did not pass validation";
            }
            if (!isUpdated) {
                return "Failed during user update";
            }
            return "User was successfully updated";
        }
        throw new IllegalArgumentException("Wrong entity");
    }
}
