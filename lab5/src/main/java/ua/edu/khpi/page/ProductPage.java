package ua.edu.khpi.page;

import ua.edu.khpi.model.Product;

public class ProductPage extends Page {

    private final Product product;

    public ProductPage(Product product) {
        this.product = product;
    }

    @Override
    public String getHeader() {
        return product.getName();
    }

    @Override
    public String getBody() {
        return product.getId() + " " + product.getDescription();
    }

    @Override
    public String getFooter() {
        return product.getImageUrl();
    }
}
