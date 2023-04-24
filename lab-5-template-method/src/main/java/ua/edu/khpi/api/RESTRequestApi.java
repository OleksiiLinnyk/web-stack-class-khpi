package ua.edu.khpi.api;

import ua.edu.khpi.entity.Identifiable;

public class RESTRequestApi {

    private final Identifiable identifiable;

    public RESTRequestApi(Identifiable identifiable) {
        this.identifiable = identifiable;
    }

    public Identifiable getIdentifiableToUpdate() {
        return identifiable;
    }
}
