package khpi.model;

public class FacebookSocialNetwork implements SocialNetwork {

    private final String login;
    private final String password;

    public FacebookSocialNetwork(String login, String password) {
        this.login = login;
        this.password = password;
        establishConnection();
    }

    @Override
    public void postMessage(String message) {
        System.out.println("Facebook post " + message);
    }

    @Override
    public void establishConnection() {
        System.out.println("Connection to Facebook account established login: " + login);
    }
}
