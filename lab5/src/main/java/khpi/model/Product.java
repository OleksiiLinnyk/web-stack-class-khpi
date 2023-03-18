package khpi.model;

public class Product {

    private String id;
    private String imageUrl;
    private String description;
    private String name;

    public Product(String id, String imageUrl, String description, String name) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.description = description;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
