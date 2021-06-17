package gymApplication.entities;

import javax.persistence.*;

@Entity
@Table(name = "Companies")

public class Companies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String company_name;

    @Column
    private Integer reg_nr;

    @ManyToOne
    @JoinColumn(name = "company_name")
    private Customer customer;

    public Companies() {
    }

    public Companies(String company_name, Integer reg_nr, Customer customer) {
        this.company_name = company_name;
        this.reg_nr = reg_nr;
        this.customer = customer;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public Integer getReg_nr() {
        return reg_nr;
    }

    public void setReg_nr(Integer reg_nr) {
        this.reg_nr = reg_nr;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Companies{" +
                "company_name='" + company_name + '\'' +
                ", reg_nr=" + reg_nr +
                ", customer=" + customer +
                '}';
    }
}
