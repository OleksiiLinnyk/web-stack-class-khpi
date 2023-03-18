package ua.edu.khpi.component;

import ua.edu.khpi.action.OrderAction;
import ua.edu.khpi.mediator.Mediator;

import java.util.Collections;

public class PhoneNumberInputField implements UiComponent {

    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void isActive(boolean value) {
        if (value) {
            System.out.println("Phone number currently active");
        } else {
            System.out.println("Phone number currently unavailable");
        }
    }

    public void typePhoneNumber(String phoneNumber) {
        System.out.printf("Phone number entered %s", phoneNumber);
        mediator.notify(OrderAction.PHONE_NUMBER_INPUT, Collections.singletonList(phoneNumber));
    }
}
