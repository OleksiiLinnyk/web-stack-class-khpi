package ua.edu.khpi.action;

public enum OrderAction {

    OTHER_PERSON_RECEIVED("otherReceiver"),
    SELF_PICKUP("pickup"),
    DATE_TIME_SLOTS("date"),
    NAME_INPUT("name"),
    PHONE_NUMBER_INPUT("phoneNumber");

    String value;

    OrderAction(String value) {
        this.value = value;
    }
}
