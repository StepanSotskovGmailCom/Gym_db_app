package gymApplication.entities;

import javax.persistence.*;

@Entity
@Table(name = "membership")

public class Membership {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String membership_type;

    @Column
    private Integer price ;

    @ManyToOne
    @JoinColumn (name="membership_type")
    private Customer customer;

    public Membership() {
    }

    public Membership(String membership_type, Integer price) {
        this.membership_type = membership_type;
        this.price = price;
    }

    public String getMembership_type() {
        return membership_type;
    }

    public void setMembership_type(String membership_type) {
        this.membership_type = membership_type;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Membership{" +
                "membership_type='" + membership_type + '\'' +
                ", price=" + price +
                ", customer=" + customer +
                '}';
    }
}

