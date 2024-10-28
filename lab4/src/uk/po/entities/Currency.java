package uk.po.entities;

public enum Currency {
    PLN("polski złoty"),
    USD("dolar amerykański");

    private final String name;

    Currency(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
