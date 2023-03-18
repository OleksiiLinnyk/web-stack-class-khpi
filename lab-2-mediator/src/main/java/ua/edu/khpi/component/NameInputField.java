package ua.edu.khpi.component;

import ua.edu.khpi.action.OrderAction;
import ua.edu.khpi.mediator.Mediator;

import java.util.Collections;

public class NameInputField implements UiComponent {

    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void isActive(boolean value) {
        if (value) {
            System.out.println("Name input field currently active");
        } else {
            System.out.println("Name input field currently unavailable");
        }
    }

    public void getName(String name) {
        System.out.printf("Name entered %s", name);
        mediator.notify(OrderAction.NAME_INPUT, Collections.singletonList(name));
    }
}
