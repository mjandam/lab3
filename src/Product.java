public class Product {
    private String name;
    private Category category;
    private float price;


    public Product() {
        this.name = "";
        this.category = new Category();
        this.price = 0.0f;
    }
    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public float getPrice() {
        return price;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setPrice(float price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive");
        }
        // Zaokrąglamy cenę do dwóch miejsc po przecinku
        this.price = Math.round(price * 100) / 100.0f;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category=" + category +
                ", price=" + price +
                '}';
    }
}