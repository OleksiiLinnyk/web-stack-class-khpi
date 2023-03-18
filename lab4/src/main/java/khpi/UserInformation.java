package khpi;

public class UserInformation {

    private String phone;
    private String senderName;

    public UserInformation(String phone, String senderName) {
        this.phone = phone;
        this.senderName = senderName;
    }

    public String getPhone() {
        return phone;
    }

    public String getSenderName() {
        return senderName;
    }
}
