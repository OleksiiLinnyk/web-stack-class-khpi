package ua.edu.khpi.render;

import ua.edu.khpi.page.Page;

public class XMLRender extends Render {

    protected final Page page;

    public XMLRender(Page page) {
        this.page = page;
    }

    @Override
    public void renderHeader() {
        if (isContentPresent(page.getHeader())) {
            System.out.printf("Render page XML header/title %s%n", page.getHeader());
        }
    }

    @Override
    public void renderBody() {
        if (isContentPresent(page.getBody())) {
            System.out.printf("Render page XML body %s%n", page.getBody());
        }
    }

    @Override
    public void renderFooter() {
        if (isContentPresent(page.getFooter())) {
            System.out.printf("Render page XML footer %s%n", page.getFooter());
        }
    }
}
