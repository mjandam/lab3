package uk.po.entities;



public class Product {
    private String name;
    private Category category;

    private Currency currency = Currency.PLN;
    private float price;


    public Product() {
        this.name = "";
        this.category = new Category();
        this.price = 0.0f;
    }

    public Product(String name, float price) {
        this(name, null, price, Currency.PLN);
    }



    public Product(String name, Category category, float price) {
        this(name, category, price, Currency.PLN);
    }
    public Product(String name, Category category, float price, Currency currency){
        setName(name);
        setCategory(category);
        setPrice(price);
        setCurrency(currency != null ? currency : Currency.PLN);
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

    public Currency getCurrency() {
        return currency;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            this.name = null;
        }else {
            this.name = name;
        }
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setPrice(float price) {
        if (price <= 0) {
            this.price = 0;
        }else {
            // Zaokrąglamy cenę do dwóch miejsc po przecinku
            this.price = Math.round(price * 100) / 100.0f;
        }
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", category=" + category +
                ", price=" + price + " " + currency +
                '}';
    }
}