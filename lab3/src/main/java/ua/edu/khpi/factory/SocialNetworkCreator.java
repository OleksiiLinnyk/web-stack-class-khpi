package ua.edu.khpi.factory;

import ua.edu.khpi.model.SocialNetwork;

public abstract class SocialNetworkCreator {

    private final String userIdentification;
    private final String password;

    protected SocialNetworkCreator(String userIdentification, String password) {
        this.userIdentification = userIdentification;
        this.password = password;
    }

    protected abstract SocialNetwork createSocialNetworkConnection(String userIdentification, String password);

    public void postMessage(String message) {
        SocialNetwork socialNetwork = createSocialNetworkConnection(userIdentification, password);
        socialNetwork.postMessage(message);
    }
}
