package ua.edu.khpi;

import ua.edu.khpi.composite.BaseElement;
import ua.edu.khpi.composite.ComposeElement;
import ua.edu.khpi.model.*;

public class Main {
    public static void main(String[] args) {

        ComposeElement form = new InputForm("checkout");
        BaseElement city = new TextInputField("city");
        BaseElement street = new TextInputField("street");
        BaseElement apartments = new TextInputField("apartments");
        BaseElement button = new Button("order");
        BaseElement deliveryCheck = new Checkbox("delivery needed");

        ComposeElement personInfoDiv = new InputForm("Delivery info section");
        BaseElement firstName = new TextInputField("first name");
        BaseElement lastName = new TextInputField("last name");
        BaseElement password = new TextInputField("password");

        BaseElement submit = new SubmitButton();

        // Setup tree
        form.addElement(city);
        form.addElement(street);
        form.addElement(apartments);
        form.addElement(button);
        form.addElement(deliveryCheck);
        form.renderElement();

//        Rendering form with name checkout which contain next elements {
//            Rendering text field with name - name
//            Render button with name - button
//            Render checkbox element with name - ageCheck
//        }

        city.renderElement();
//        Rendering text field with name - name
        button.renderElement();
//        Render button with name - button

        personInfoDiv.addElement(firstName);
        personInfoDiv.addElement(lastName);
        personInfoDiv.addElement(password);
        personInfoDiv.addElement(submit);

        form.addElement(personInfoDiv);
        form.renderElement();

//        Rendering form with name checkout which contain next elements {
//            Rendering text field with name - city
//            Rendering text field with name - street
//            Rendering text field with name - apartments
//            Render button with name - order
//            Render checkbox element with name - delivery needed
//            Rendering form with name Delivery info section which contain next elements {
//                Rendering text field with name - first name
//                Rendering text field with name - last name
//                Rendering text field with name - password
//                Render submit button
//            }
//        }
    }
}
