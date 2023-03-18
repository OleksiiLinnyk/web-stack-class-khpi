package ua.edu.khpi.mediator;

import ua.edu.khpi.action.OrderAction;

import java.util.List;

public interface Mediator {

    void notify(OrderAction action, List<String> parameters);
}
