public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Add products
        inventory.addProduct(new Product("P101", "Laptop", 10, 50000));
        inventory.addProduct(new Product("P102", "Mouse", 50, 500));
        inventory.addProduct(new Product("P103", "Keyboard", 30, 1500));

        System.out.println("\n-------------------------------------------------------------------------------");
        // Display inventory
        inventory.showInventory();
        System.out.println("\n-------------------------------------------------------------------------------");
        // Update product
        inventory.updateProduct("P102", 100, 450);
        System.out.println("\n-------------------------------------------------------------------------------");
        // Delete product
        inventory.deleteProduct("P103");
        System.out.println("\n-------------------------------------------------------------------------------");
        // Display inventory after updates
        inventory.showInventory();
    }
}
