package gymApplication.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Companies")

public class Companies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String company_name;

    @Column
    private Integer reg_nr;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "companies")
    private Set<Customer> customers;



    public Companies() {
    }

    public Companies(String company_name, Integer reg_nr, Set<Customer> customers) {
        this.company_name = company_name;
        this.reg_nr = reg_nr;
        this.customers = customers;
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

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "Companies{" +
                "company_name='" + company_name + '\'' +
                ", reg_nr=" + reg_nr +
                ", customers=" + customers +
                '}';
    }
}
