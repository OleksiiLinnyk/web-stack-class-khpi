package ua.edu.khpi.model;

import ua.edu.khpi.composite.BaseElement;

public class Button implements BaseElement {

    private final String name;

    public Button(String name) {
        this.name = name;
    }

    @Override
    public void renderElement() {
        System.out.println("Render button with name - " + name);
    }
}
