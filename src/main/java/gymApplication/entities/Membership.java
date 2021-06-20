package gymApplication.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "membership")

public class Membership {

    @Id
    @Column(name = "membership_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer membership_id;

    @Column
    private String membership_type;

    @Column
    private Integer price;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "membership")
    private final Set<Customer> customers = new HashSet<>();

    public Membership() {
    }

    public Membership(String membership_type, Integer price) {
        this.membership_type = membership_type;
        this.price = price;
    }

    public Integer getMembership_id() {
        return membership_id;
    }

    public void setMembership_id(Integer membership_id) {
        this.membership_id = membership_id;
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

    public Set<Customer> getCustomers() {
        return customers;
    }

    @Override
    public String toString() {
        return "Membership{" +
                "membership_id=" + membership_id +
                ", membership_type='" + membership_type + '\'' +
                ", price=" + price +
                ", customers=" + customers +
                '}';
    }
}

