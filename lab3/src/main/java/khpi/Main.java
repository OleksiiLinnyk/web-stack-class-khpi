package khpi;

import khpi.factory.FacebookConnectionCreator;
import khpi.factory.LinkedInConnectionCreator;
import khpi.factory.SocialNetworkCreator;

public class Main {
    public static void main(String[] args) {
        SocialNetworkCreator socialNetworkCreator;
        if (System.getenv("socialNetwork").equals("Facebook")) {
            socialNetworkCreator = new FacebookConnectionCreator("OleksiiL", "123456");
        } else {
            socialNetworkCreator = new LinkedInConnectionCreator("oleksiiL@gmail.com", "34313");
        }
        socialNetworkCreator.postMessage("Social network post");
    }
}
