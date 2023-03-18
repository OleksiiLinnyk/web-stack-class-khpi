package ua.edu.khpi.model;

public class LinkedInSocialNetwork implements SocialNetwork {

    private final String email;
    private final String password;

    public LinkedInSocialNetwork(String email, String password) {
        this.email = email;
        this.password = password;
        establishConnection();
    }

    @Override
    public void postMessage(String message) {
        System.out.println("LinkedIn post " + message);
    }

    @Override
    public void establishConnection() {
        System.out.println("Connection to LinkedIn account established: " + email);
    }
}
