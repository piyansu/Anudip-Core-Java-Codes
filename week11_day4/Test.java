package week11_day4;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ProductPersistenceUnit");
        ProductDao productDao = new ProductDaoImpl(entityManagerFactory);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add a new product");
            System.out.println("2. Print all existing products");
            System.out.println("3. Update quantity on hand for a product");
            System.out.println("4. Remove a product");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    int price = scanner.nextInt();
                    System.out.print("Enter quantity on hand: ");
                    int qty = scanner.nextInt();
                    Product newProduct = new Product(name, price, qty);
                    productDao.addProduct(newProduct);
                    System.out.println("Product added successfully.");
                    break;
                case 2:
                    System.out.println("Existing Products:");
                    productDao.printAllProducts();
                    break;
                case 3:
                    System.out.print("Enter product ID to update: ");
                    int productId = scanner.nextInt();
                    System.out.print("Enter new quantity on hand: ");
                    int newQty = scanner.nextInt();
                    productDao.updateQtyOnHand(productId, newQty);
                    System.out.println("Quantity updated successfully.");
                    break;
                case 4:
                    System.out.print("Enter product ID to remove: ");
                    int removeId = scanner.nextInt();
                    productDao.removeProduct(removeId);
                    System.out.println("Product removed successfully.");
                    break;
                case 5:
                    entityManagerFactory.close();
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
