package week11_day4;

import javax.persistence.*;

@Entity
@Table(name = "inventory_table")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int id;

    @Column(name = "product_name")
    private String name;

    @Column(name = "product_price")
    private int price;

    @Column(name = "quantity_on_hand")
    private int qtyOnHand;

    // Default constructor (required by JPA)
    public Product() {
    }

    // Constructor with fields
    public Product(String name, int price, int qtyOnHand) {
        this.name = name;
        this.price = price;
        this.qtyOnHand = qtyOnHand;
    }

    // Getters and Setters for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getters and Setters for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getters and Setters for price
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // Getters and Setters for qtyOnHand
    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    // Override toString() for better representation
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", qtyOnHand=" + qtyOnHand +
                '}';
    }
}
