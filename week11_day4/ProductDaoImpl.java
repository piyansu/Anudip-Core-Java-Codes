package week11_day4;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ProductDaoImpl implements ProductDao {
    private EntityManagerFactory entityManagerFactory;

    public ProductDaoImpl(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    @Override
    public void addProduct(Product product) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = null;
        try {
            transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(product);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }

    @Override
    public void printAllProducts() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("SELECT p FROM Product p");
        @SuppressWarnings("unchecked")
        java.util.List<Product> productList = query.getResultList();
        for (Product product : productList) {
            System.out.println(product);
        }
        entityManager.close();
    }

    @Override
    public void updateQtyOnHand(int productId, int newQty) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = null;
        try {
            transaction = entityManager.getTransaction();
            transaction.begin();
            Product product = entityManager.find(Product.class, productId);
            if (product != null) {
                product.setQtyOnHand(newQty);
                entityManager.merge(product);
                transaction.commit();
            } else {
                System.out.println("Product with ID " + productId + " not found.");
            }
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }

    @Override
    public void removeProduct(int productId) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = null;
        try {
            transaction = entityManager.getTransaction();
            transaction.begin();
            Product product = entityManager.find(Product.class, productId);
            if (product != null) {
                entityManager.remove(product);
                transaction.commit();
            } else {
                System.out.println("Product with ID " + productId + " not found.");
            }
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }
}
