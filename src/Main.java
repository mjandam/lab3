public class Main {
    public static void main(String[] args) {

        Category category = new Category();


        try {
            category.setName("Electronics");
            System.out.println("Category name set successfully: " + category);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        try {
            category.setName(null);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        try {
            category.setName("");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}