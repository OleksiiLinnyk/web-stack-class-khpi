package khpi.factory;

import khpi.model.LinkedInSocialNetwork;

public class LinkedInConnectionCreator extends SocialNetworkCreator {

    public LinkedInConnectionCreator(String userIdentification, String password) {
        super(userIdentification, password);
    }

    @Override
    protected LinkedInSocialNetwork createSocialNetworkConnection(String userIdentification, String password) {
        return new LinkedInSocialNetwork(userIdentification, password);
    }
}
