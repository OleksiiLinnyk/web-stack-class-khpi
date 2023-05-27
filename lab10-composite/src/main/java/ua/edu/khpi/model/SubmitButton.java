package ua.edu.khpi.model;

import ua.edu.khpi.composite.BaseElement;

public class SubmitButton implements BaseElement {
    @Override
    public void renderElement() {
        System.out.println("Render submit button");
    }
}
