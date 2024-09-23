public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Inventory inventory = new Inventory();

        // Adding products
        inventory.addProduct(new Product("Laptop", 999.99, 10));
        inventory.addProduct(new Product("Smartphone", 499.99, 25));
        inventory.addProduct(new Product("Tablet", 299.99, 15));
        inventory.addProduct(new Product("Monitor", 199.99, 5));

        System.out.println("Products sorted by name:");
        inventory.sortByName();
        inventory.displayProducts();

        System.out.println("\nProducts sorted by price:");
        inventory.sortByPrice();
        inventory.displayProducts();

        System.out.println("\nProducts sorted by quantity:");
        inventory.sortByQuantity();
        inventory.displayProducts();

        // Cloning a product
        Product clonedProduct = inventory.iterator().next().clone();
        System.out.println("\nCloned Product: " + clonedProduct);
    }
}