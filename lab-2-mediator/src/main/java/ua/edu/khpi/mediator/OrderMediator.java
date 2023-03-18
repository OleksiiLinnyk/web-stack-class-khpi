package ua.edu.khpi.mediator;

import ua.edu.khpi.action.OrderAction;
import ua.edu.khpi.component.*;

import java.util.List;

public class OrderMediator implements Mediator {

    private final DateDropdown dateDropdown;
    private final NameInputField nameInputField;
    private final OtherPersonReceivedCheckbox otherPersonReceivedCheckbox;
    private final PhoneNumberInputField phoneNumberInputField;
    private final SelfPickupCheckbox selfPickupCheckbox;

    public OrderMediator(DateDropdown dateDropdown, NameInputField nameInputField,
                         OtherPersonReceivedCheckbox otherPersonReceivedCheckbox,
                         PhoneNumberInputField phoneNumberInputField, SelfPickupCheckbox selfPickupCheckbox) {
        this.dateDropdown = dateDropdown;
        this.nameInputField = nameInputField;
        this.otherPersonReceivedCheckbox = otherPersonReceivedCheckbox;
        this.phoneNumberInputField = phoneNumberInputField;
        this.selfPickupCheckbox = selfPickupCheckbox;

        this.dateDropdown.setMediator(this);
        this.nameInputField.setMediator(this);
        this.otherPersonReceivedCheckbox.setMediator(this);
        this.phoneNumberInputField.setMediator(this);
        this.selfPickupCheckbox.setMediator(this);
    }


    @Override
    public void notify(OrderAction action, List<String> parameters) {
        if (action.equals(OrderAction.SELF_PICKUP)) {
            if (parameters.get(0).equals("true")) {
                otherPersonReceivedCheckbox.isActive(false);
                nameInputField.isActive(false);
                dateDropdown.isActive(false);
                phoneNumberInputField.isActive(false);
            } else {
                otherPersonReceivedCheckbox.isActive(true);
                nameInputField.isActive(true);
                dateDropdown.isActive(true);
                phoneNumberInputField.isActive(true);
            }
        } else if (action.equals(OrderAction.OTHER_PERSON_RECEIVED)) {
            if (parameters.get(0).equals("true")) {
                nameInputField.isActive(true);
                phoneNumberInputField.isActive(true);
            } else {
                nameInputField.isActive(false);
                phoneNumberInputField.isActive(false);
            }
        } else if (action.equals(OrderAction.DATE_TIME_SLOTS)) {
            dateDropdown.displayAvailableDeliveryTimes(parameters.get(0));
        }
    }
}
