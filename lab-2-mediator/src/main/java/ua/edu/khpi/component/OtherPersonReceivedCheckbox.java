package ua.edu.khpi.component;

import ua.edu.khpi.action.OrderAction;
import ua.edu.khpi.mediator.Mediator;

import java.util.Collections;

public class OtherPersonReceivedCheckbox implements UiComponent {

    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void isActive(boolean value) {
        if (value) {
            System.out.println("Other person receiver option currently active");
        } else {
            System.out.println("Other person receiver option currently unavailable");
        }
    }

    public void selectCheckBox(boolean isSelected) {
        System.out.printf("Other person receiver checkbox is selected: %b", isSelected);
        mediator.notify(OrderAction.OTHER_PERSON_RECEIVED, Collections.singletonList(String.valueOf(isSelected)));
    }
}
