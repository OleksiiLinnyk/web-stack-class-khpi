package ua.edu.khpi.model;

import ua.edu.khpi.composite.BaseElement;

public class TextInputField implements BaseElement {

    private String name;

    public TextInputField(String name) {
        this.name = name;
    }

    @Override
    public void renderElement() {
        System.out.println("Rendering text field with name - " + name);
    }
}
