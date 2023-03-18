package khpi.factory;

import khpi.model.FacebookSocialNetwork;

public class FacebookConnectionCreator extends SocialNetworkCreator {


    public FacebookConnectionCreator(String userIdentification, String password) {
        super(userIdentification, password);
    }

    @Override
    protected FacebookSocialNetwork createSocialNetworkConnection(String userIdentification, String password) {
        return new FacebookSocialNetwork(userIdentification, password);
    }
}
