package week11_day4;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class ProductDaoImpl implements ProductDao {

    private final EntityManagerFactory entityManagerFactory;
    private final EntityManager entityManager;

    public ProductDaoImpl() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("PersistenceUnit");
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    @Override
    public void addProduct(Product product) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(product);
            entityManager.getTransaction().commit();
            System.out.println("Product added successfully.");
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    @Override
    public List<Product> getAllProducts() {
        Query query = entityManager.createQuery("SELECT p FROM Product p");
        return query.getResultList();
    }

    @Override
    public void updateQtyOnHand(int productId, int newQty) {
        try {
            entityManager.getTransaction().begin();
            Product product = entityManager.find(Product.class, productId);
            if (product != null) {
                product.setQtyOnHand(newQty);
                entityManager.getTransaction().commit();
                System.out.println("Quantity on hand updated successfully.");
            } else {
                System.out.println("Product with ID " + productId + " not found.");
            }
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    @Override
    public void removeProductById(int productId) {
        try {
            entityManager.getTransaction().begin();
            Product product = entityManager.find(Product.class, productId);
            if (product != null) {
                entityManager.remove(product);
                entityManager.getTransaction().commit();
                System.out.println("Product removed successfully.");
            } else {
                System.out.println("Product with ID " + productId + " not found.");
            }
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void closeEntityManager() {
        entityManager.close();
        entityManagerFactory.close();
    }
}

