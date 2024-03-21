package week11_day4;

public interface ProductDao {
    void addProduct(Product product);
    void printAllProducts();
    void updateQtyOnHand(int productId, int newQty);
    void removeProduct(int productId);
}
