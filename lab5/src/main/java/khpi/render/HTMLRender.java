package khpi.render;

import khpi.page.Page;

public class HTMLRender extends XMLRender {
    public HTMLRender(Page page) {
        super(page);
    }


    @Override
    public void renderHeader() {
        if (isContentPresent(page.getHeader())) {
            System.out.printf("Render page HTML header/title %s%n", page.getHeader());
        }
    }

    @Override
    public void renderBody() {
        if (isContentPresent(page.getBody())) {
            System.out.printf("Render page HTML body %s%n", page.getBody());
        }
    }

    @Override
    public void renderFooter() {
        if (isContentPresent(page.getFooter())) {
            System.out.printf("Render page HTML footer %s%n", page.getFooter());
        }
    }
}
