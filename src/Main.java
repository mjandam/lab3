public class Main {
    public static void main(String[] args) {
        // Testowanie klasy Category
        Category category = new Category();
        category.setName("Electronics");

        // Testowanie klasy Product
        Product product = new Product();
        product.setName("Smartphone");
        product.setCategory(category);

        try {
            product.setPrice(599.999f);  // Cena zostanie zaokrąglona do 600.00
            System.out.println("Product: " + product);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Próbujemy ustawić nieprawidłową cenę
        try {
            product.setPrice(-10.5f);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Próbujemy ustawić pustą nazwę
        try {
            product.setName("");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}