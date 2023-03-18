package ua.edu.khpi.component;

import ua.edu.khpi.action.OrderAction;
import ua.edu.khpi.mediator.Mediator;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;

public class DateDropdown implements UiComponent {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void isActive(boolean value) {
        if (value) {
            System.out.println("Date drop down currently active");
        } else {
            System.out.println("Date drop down currently unavailable");
        }
    }

    public void displayAvailableDeliveryTimes(String date) {
        if (date != null) {
            LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
            System.out.println("Available delivery times for date " + localDate.toString());
            LocalDateTime localDateTime = LocalDateTime.of(localDate, LocalTime.of(12, 00, 00));
            for (int i = 0; i <= 5; i++) {
                System.out.printf("Slot %s - %s", i, localDateTime.toLocalTime());
                System.out.println("\n");
                localDateTime = localDateTime.plusHours(2);
            }
        }
    }

    public void selectDate(LocalDate date) {
        mediator.notify(OrderAction.DATE_TIME_SLOTS, Collections.singletonList(date.toString()));
    }
}
