package khpi;

public class SlackConnector {

    private String login;
    private String apiKey;
    private String chatId;

    public SlackConnector(String login, String apiKey, String chatId) {
        this.login = login;
        this.apiKey = apiKey;
        this.chatId = chatId;
    }

    public String getLogin() {
        return login;
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getChatId() {
        return chatId;
    }

    public void connectToSlack() {
        System.out.printf("You are connected to slack with login %s and api key %s%n", login, apiKey);
        System.out.printf("You are entered to the chat %s%n", chatId);
    }
}
