package gymApplication.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "customer")

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customer_id;

    @Column
    private String customer_name;

    @Column
    private String customer_surname;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Companies companies;

    @ManyToOne
    @JoinColumn(name = "membership_id")
    private Membership membership;

    public Customer() {
    }

    public Customer(Integer customer_id, String customer_name, String customer_surname, Companies companies, Membership membership) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.customer_surname = customer_surname;
        this.companies = companies;
        this.membership = membership;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_surname() {
        return customer_surname;
    }

    public void setCustomer_surname(String customer_surname) {
        this.customer_surname = customer_surname;
    }

    public Companies getCompanies() {
        return companies;
    }

    public void setCompanies(Companies companies) {
        this.companies = companies;
    }

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customer_id +
                ", customer_name='" + customer_name + '\'' +
                ", customer_surname='" + customer_surname + '\'' +
                ", companies=" + companies +
                ", membership=" + membership +
                '}';
    }
}
