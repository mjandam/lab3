package uk.po.entities;

public class Category {
    private String name;

    public Category() {
        this.name = "";
    }

    public Category(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            this.name = null;
        }else {
            this.name = name;
        }
    }

    @Override
    public String toString() {
        return  name;
    }
}