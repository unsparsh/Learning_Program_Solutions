package EcommerceSearch;

public class Main {
    public static void main(String[] args) {
        Product[] inventory = {
            new Product("P001", "Shoes", "Footwear"),
            new Product("P002", "Watch", "Accessories"),
            new Product("P003", "Phone", "Electronics"),
            new Product("P004", "Shirt", "Clothing"),
            new Product("P005", "Laptop", "Electronics")
        };

        System.out.println("Linear Search for 'Watch'");
        Product foundLinear = SearchService.linearSearch(inventory, "Watch");
        System.out.println(foundLinear != null ? foundLinear : "Product not found.");

        System.out.println("\nBinary Search for 'Phone'");
        Product foundBinary = SearchService.binarySearch(inventory, "Phone");
        System.out.println(foundBinary != null ? foundBinary : "Product not found.");
    }
}
