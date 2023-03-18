package ua.edu.khpi.component;

import ua.edu.khpi.action.OrderAction;
import ua.edu.khpi.mediator.Mediator;

import java.util.Collections;

public class SelfPickupCheckbox implements UiComponent {

    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void isActive(boolean value) {
        if (value) {
            System.out.println("Self pickup active");
        } else {
            System.out.println("Self pickup currently unavailable");
        }
    }

    public void selectSelfPickupCheckbox(boolean isSelected) {
        System.out.printf("Self pickup checkbox is selected: %b", isSelected);
        mediator.notify(OrderAction.SELF_PICKUP, Collections.singletonList(String.valueOf(isSelected)));
    }
}
