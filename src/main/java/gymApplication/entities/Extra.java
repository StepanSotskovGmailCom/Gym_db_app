package gymApplication.entities;

import javax.persistence.*;

@Entity
@Table(name = "extra")

public class Extra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String extra_id;

    @ManyToOne
    @JoinColumn (name="extra_id")
    private Customer customer;

    public Extra() {
    }

    public Extra(String extra_id, Customer customer) {
        this.extra_id = extra_id;
        this.customer = customer;
    }

    public String getExtra_id() {
        return extra_id;
    }

    public void setExtra_id(String extra_id) {
        this.extra_id = extra_id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Extra{" +
                "extra_id='" + extra_id + '\'' +
                ", customer=" + customer +
                '}';
    }
}

