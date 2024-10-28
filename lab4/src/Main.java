import uk.po.entities.Category;
import uk.po.entities.Currency;
import uk.po.entities.Product;

public class Main {
    public static void main(String[] args) {
        System.out.println("== Test klasy Category ==");
        Category poprawnyCategory = new Category("Elektornia");
        System.out.println("Prawidłowa kategoria: " + poprawnyCategory);

        Category niePoprawnyCategory = new Category("");
        System.out.println("Nieprawidłowa kategoria (empty name): " + niePoprawnyCategory);

        System.out.println("\n== Test enum Currency ==");
        System.out.println("Waluta PLN: " + Currency.PLN.getName());
        System.out.println("Waluta USD: " + Currency.USD.getName());


        System.out.println("\n== Test dwuargumentowego konstruktora Product ==");
        Product product1 = new Product("Laptop", 1200.99f);
        System.out.println("Produkt z nazwą i ceną: " + product1);

        Product invalidProduct1 = new Product(null, -10.0f);
        System.out.println("Nieprawidłowy produkt z zerową nazwą i ujemną ceną: " + invalidProduct1);

        System.out.println("\n== Test trójargumentowego konstruktora Product ==");
        Product product2 = new Product("Smartwatch", poprawnyCategory, 799.99f);
        System.out.println("Produkt z nazwą, kategorią i ceną: " + product2);

        Product invalidProduct2 = new Product("", null, -500.0f);
        System.out.println("Nieprawidłowy produkt z pustą nazwą, zerową kategorią i ujemną ceną: " + invalidProduct2);

        System.out.println("\n== Test czteroargumentowego konstruktora Product ==");
        Product product3 = new Product("Słuchawki", poprawnyCategory, 199.99f, Currency.USD);
        System.out.println("Produkt z nazwą, kategorią, ceną i walutą: " + product3);

        Product invalidProduct3 = new Product(null, null, -30.0f, Currency.USD);
        System.out.println("Nieprawidłowy produkt z wartościami null i ujemną ceną:" + invalidProduct3);

        System.out.println("\n== Test setterów i walidacji ==");
        Product product4 = new Product("TV", 500.0f);
        System.out.println("Produkt początkowy: " + product4);

        product4.setName("");
        product4.setPrice(-100.0f);
        product4.setCategory(null);
        product4.setCurrency(Currency.PLN);

        System.out.println("Po ustawieniu nieprawidłowych wartości " + product4);

        // Test poprawnego ustawienia nowych wartości
        product4.setName("4K TV");
        product4.setPrice(1200.0f);
        product4.setCategory(poprawnyCategory);

        System.out.println("Po ustawieniu prawidłowych wartości: " + product4);
    }
}
