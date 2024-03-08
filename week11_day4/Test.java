package week11_day4;

import java.util.List;
import java.util.Scanner;

public class Test {

    private static final Scanner scanner = new Scanner(System.in);
    private static final ProductDao productDao = new ProductDaoImpl();

    public static void main(String[] args) {
        while (true) {
            System.out.println("--------- Product Management System ---------");
            System.out.println("1. Add a new Product");
            System.out.println("2. Print all Products");
            System.out.println("3. Update Quantity on Hand");
            System.out.println("4. Remove a Product");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    printAllProducts();
                    break;
                case 3:
                    updateQtyOnHand();
                    break;
                case 4:
                    removeProduct();
                    break;
                case 5:
                    productDao.closeEntityManager();
                    System.out.println("Exiting Program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addProduct() {
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();

        System.out.print("Enter product price: ");
        int price = scanner.nextInt();

        System.out.print("Enter quantity on hand: ");
        int qtyOnHand = scanner.nextInt();

        Product product = new Product(name, price, qtyOnHand);
        productDao.addProduct(product);
    }

    private static void printAllProducts() {
        List<Product> productList = productDao.getAllProducts();
        if (productList.isEmpty()) {
            System.out.println("No products found.");
        } else {
            System.out.println("------ All Products ------");
            for (Product product : productList) {
                System.out.println(product);
            }
        }
    }

    private static void updateQtyOnHand() {
        System.out.print("Enter product ID: ");
        int productId = scanner.nextInt();

        System.out.print("Enter new quantity on hand: ");
        int newQty = scanner.nextInt();

        productDao.updateQtyOnHand(productId, newQty);
    }

    private static void removeProduct() {
        System.out.print("Enter product ID to remove: ");
        int productId = scanner.nextInt();

        productDao.removeProductById(productId);
    }
}

