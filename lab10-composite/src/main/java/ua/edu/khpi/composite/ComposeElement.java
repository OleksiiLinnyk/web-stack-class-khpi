package ua.edu.khpi.composite;

public interface ComposeElement extends BaseElement {

    void addElement(BaseElement baseElement);
    void removeElement(BaseElement baseElement);
}
