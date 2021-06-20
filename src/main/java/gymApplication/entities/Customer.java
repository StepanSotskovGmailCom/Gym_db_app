package gymApplication.entities;

import javax.persistence.*;

@Entity
@Table(name = "customer")

public class Customer {

    @Id
    @Column(name = "customer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customer_id;

    @Column(name = "customer_name")
    private String customer_name;

    @Column(name = "customer_surname")
    private String customer_surname;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_company")
    private Companies company;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "membership_id")
    private Membership membership;

    public Customer() {
    }

    public Customer(String customer_name, String customer_surname, Companies company, Membership membership) {
        this.customer_name = customer_name;
        this.customer_surname = customer_surname;
        this.company = company;
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
        return company;
    }

    public void setCompanies(Companies companies) {
        this.company = companies;
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
                ", company_name=" + company.getCompany_name() +
                ", membership_type=" + membership.getMembership_type() +
                '}';
    }
}
