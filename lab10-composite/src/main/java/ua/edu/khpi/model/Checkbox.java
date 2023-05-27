package ua.edu.khpi.model;

import ua.edu.khpi.composite.BaseElement;

public class Checkbox implements BaseElement {

    private final String name;

    public Checkbox(String name) {
        this.name = name;
    }

    @Override
    public void renderElement() {
        System.out.println("Render checkbox element with name - " + name);
    }
}
