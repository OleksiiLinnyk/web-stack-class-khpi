package ua.edu.khpi;

import ua.edu.khpi.component.*;
import ua.edu.khpi.mediator.OrderMediator;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        DateDropdown dateDropdown = new DateDropdown();
        NameInputField nameInputField = new NameInputField();
        OtherPersonReceivedCheckbox otherPersonReceivedCheckbox = new OtherPersonReceivedCheckbox();
        PhoneNumberInputField phoneNumberInputField = new PhoneNumberInputField();
        SelfPickupCheckbox selfPickupCheckbox = new SelfPickupCheckbox();

        new OrderMediator(dateDropdown, nameInputField, otherPersonReceivedCheckbox, phoneNumberInputField, selfPickupCheckbox);

        dateDropdown.selectDate(LocalDate.now());
//        Available delivery times for date 2023-03-18
//        Slot 0 - 12:00
//
//        Slot 1 - 14:00
//
//        Slot 2 - 16:00
//
//        Slot 3 - 18:00
//
//        Slot 4 - 20:00
//
//        Slot 5 - 22:00

        otherPersonReceivedCheckbox.selectCheckBox(true);
        nameInputField.getName("Oleksii Linnyk");
        phoneNumberInputField.typePhoneNumber("12345678909");
        otherPersonReceivedCheckbox.selectCheckBox(false);
//        Other person receiver checkbox is selected: true
//        Name input field currently active
//        Phone number currently active
//        Name entered Oleksii Linnyk
//        Phone number entered 12345678909
//        Other person receiver checkbox is selected: false
//        Name input field currently unavailable
//        Phone number currently unavailable

        selfPickupCheckbox.selectSelfPickupCheckbox(true);
//        Self pickup checkbox is selected: true
//        Other person receiver option currently unavailable
//        Name input field currently unavailable
//        Date drop down currently unavailable
//        Phone number currently unavailable
        selfPickupCheckbox.selectSelfPickupCheckbox(false);
//        Self pickup checkbox is selected: false
//        Other person receiver option currently active
//        Name input field currently active
//        Date drop down currently active
//        Phone number currently active

    }
}
