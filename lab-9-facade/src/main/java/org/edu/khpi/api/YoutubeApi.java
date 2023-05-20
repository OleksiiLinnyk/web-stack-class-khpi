package org.edu.khpi.api;

public class YoutubeApi implements ResourceApiConnector {

    private static final String URL = "https://youtube.com";

    private String apiKey;

    public YoutubeApi() {
    }

    public YoutubeApi(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public void doRequest(String request) {
        if (apiKey != null) {
            System.out.printf("QUERY '%s' to %s with API key '%s'%n", request, URL, apiKey);
        } else {
            System.out.println("ERROR: API key is not present");
        }
    }
}
