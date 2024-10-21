public class Category {
    private String name;

    public Category() {
        this.name = "";
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{name='" + name + "'}";
    }
}