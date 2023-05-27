package ua.edu.khpi.model;

import ua.edu.khpi.composite.BaseElement;
import ua.edu.khpi.composite.ComposeElement;

import java.util.ArrayList;
import java.util.List;

public class InputForm implements ComposeElement {

    private final String name;

    private final List<BaseElement> elements = new ArrayList<>();

    public InputForm(String name) {
        this.name = name;
    }

    @Override
    public void renderElement() {
        System.out.println("Rendering form with name " + name + " which contain next elements {");
        elements.forEach(BaseElement::renderElement);
        System.out.println("}");
    }

    @Override
    public void addElement(BaseElement baseElement) {
        elements.add(baseElement);
    }

    @Override
    public void removeElement(BaseElement baseElement) {
        elements.remove(baseElement);
    }
}
