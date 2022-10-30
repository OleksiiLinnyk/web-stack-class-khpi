package ua.edu.khpi.render;

public abstract class Render {

    protected abstract void renderHeader();

    protected abstract void renderBody();

    protected abstract void renderFooter();

    protected boolean isContentPresent(String content) {
        return !content.isBlank();
    }

    public void renderPage() {
        renderHeader();
        renderBody();
        renderFooter();
    }
}
