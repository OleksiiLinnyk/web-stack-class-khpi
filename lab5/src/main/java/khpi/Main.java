package khpi;

import khpi.model.Product;
import khpi.page.Page;
import khpi.page.ProductPage;
import khpi.page.SimplePage;
import khpi.render.HTMLRender;
import khpi.render.JSONRender;
import khpi.render.Render;
import khpi.render.XMLRender;

public class Main {

    public static void main(String[] args) {
        Page page1 = new SimplePage("Bridge pattern title", "Implementation of bridge pattern");
        Page page2 = new ProductPage(new Product("11", "http://testimageurl.com", "Some description", "Donut"));


        Render render1 = new XMLRender(page1);
        Render render2 = new HTMLRender(page1);
        Render render3 = new JSONRender(page2);

        render1.renderPage();
        render2.renderPage();
        render3.renderPage();
    }
}
