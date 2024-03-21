package week12_day1;

import javax.persistence.*;

@Entity
@Table(name = "laptop")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "serial_no")
    private long serialNo;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "price")
    private float price;

    // Getters, setters, and constructors
    public long getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(long serialNo) {
        this.serialNo = serialNo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

