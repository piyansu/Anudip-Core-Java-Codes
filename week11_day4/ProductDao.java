package week11_day4;

import java.util.List;

public interface ProductDao {

    void addProduct(Product product);

    List<Product> getAllProducts();

    void updateQtyOnHand(int productId, int newQty);

    void removeProductById(int productId);
}

