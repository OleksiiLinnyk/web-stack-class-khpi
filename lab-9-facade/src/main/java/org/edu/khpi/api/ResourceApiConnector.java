package org.edu.khpi.api;

public interface ResourceApiConnector {

    void setApiKey(String apiKey);
    void doRequest(String request);
}
