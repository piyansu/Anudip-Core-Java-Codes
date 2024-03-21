package week11_day4;

import javax.persistence.*;

@Entity
@Table(name = "products_table")
class Product {
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

    // Constructors, getters, and setters
    public Product() {}

    public Product(String name, int price, int qtyOnHand) {
        this.name = name;
        this.price = price;
        this.qtyOnHand = qtyOnHand;
    }

    // Getters and setters
    // Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Price
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // Quantity On Hand
    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

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
