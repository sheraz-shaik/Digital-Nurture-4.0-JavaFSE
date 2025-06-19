import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// Class representing a product with basic attributes
class Product {
    int id;
    String name;
    String type;

    public Product(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product ID: " + id + ", Name: " + name + ", Category: " + type;
    }
}

public class ProductLookup {

    // Method to perform a linear search by product ID
    public static Product findByIdLinear(Product[] inventory, int targetId) {
        for (Product item : inventory) {
            if (item.id == targetId) {
                return item;
            }
        }
        return null;
    }

    // Method to perform binary search by product ID (assumes sorted array)
    public static Product findByIdBinary(Product[] inventory, int targetId) {
        int low = 0;
        int high = inventory.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (inventory[mid].id == targetId) {
                return inventory[mid];
            }

            if (inventory[mid].id < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for the number of products to be entered
        System.out.print("Enter total number of products: ");
        int count = input.nextInt();
        input.nextLine(); // Consume leftover newline

        Product[] inventory = new Product[count];

        // Input each product's details
        for (int i = 0; i < count; i++) {
            System.out.print("Enter ID for product " + (i + 1) + ": ");
            int id = input.nextInt();
            input.nextLine(); // Consume newline

            System.out.print("Enter name for product " + (i + 1) + ": ");
            String name = input.nextLine();

            System.out.print("Enter category for product " + (i + 1) + ": ");
            String type = input.nextLine();

            inventory[i] = new Product(id, name, type);
        }

        // Sort products by ID before performing binary search
        Arrays.sort(inventory, new Comparator<Product>() {
            public int compare(Product p1, Product p2) {
                return Integer.compare(p1.id, p2.id);
            }
        });

        // Ask user for the ID to search
        System.out.print("Enter a product ID to search: ");
        int searchKey = input.nextInt();

        // Linear Search Result
        Product resultLinear = findByIdLinear(inventory, searchKey);
        if (resultLinear != null) {
            System.out.println("Found using Linear Search: " + resultLinear);
        } else {
            System.out.println("No product found using Linear Search.");
        }

        // Binary Search Result
        Product resultBinary = findByIdBinary(inventory, searchKey);
        if (resultBinary != null) {
            System.out.println("Found using Binary Search: " + resultBinary);
        } else {
            System.out.println("No product found using Binary Search.");
        }

        input.close();
    }
}
