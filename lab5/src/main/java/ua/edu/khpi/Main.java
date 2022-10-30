package ua.edu.khpi;

import ua.edu.khpi.model.Product;
import ua.edu.khpi.page.Page;
import ua.edu.khpi.page.ProductPage;
import ua.edu.khpi.page.SimplePage;
import ua.edu.khpi.render.HTMLRender;
import ua.edu.khpi.render.JSONRender;
import ua.edu.khpi.render.Render;
import ua.edu.khpi.render.XMLRender;

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
