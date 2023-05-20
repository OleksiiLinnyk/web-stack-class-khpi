package org.edu.khpi.facade;

import org.edu.khpi.api.ResourceApiConnector;

public class ApiFacadeImpl implements ApiFacade {
    private ResourceApiConnector resourceApiConnector;

    public ApiFacadeImpl(ResourceApiConnector resourceApiConnector) {
        this.resourceApiConnector = resourceApiConnector;
    }

    @Override
    public void doRequest(String apiKey, String request) {
        resourceApiConnector.setApiKey(apiKey);
        resourceApiConnector.doRequest(request);
    }
}
