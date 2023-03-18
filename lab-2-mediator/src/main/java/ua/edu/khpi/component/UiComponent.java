package ua.edu.khpi.component;

import ua.edu.khpi.mediator.Mediator;

public interface UiComponent {

    void setMediator(Mediator mediator);

    void isActive(boolean value);
}
