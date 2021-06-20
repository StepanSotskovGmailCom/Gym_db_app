package gymApplication.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Companies")

public class Companies {

    @Id
    @Column(name = "company_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "company_name")
    private String company_name;

    @Column(name = "reg_nr")
    private Integer reg_nr;


    @OneToMany(fetch = FetchType.EAGER, mappedBy = "company")
    private final Set<Customer> customers = new HashSet<>();


    public Companies() {
    }

    public Companies(String company_name, Integer reg_nr) {
        this.company_name = company_name;
        this.reg_nr = reg_nr;
    }

    public Integer getCompany_id() {
        return ID;
    }

    public void setCompany_id(Integer company_id) {
        this.ID = company_id;
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

    @Override
    public String toString() {
        return "Companies{" +
                "company_id=" + ID +
                ", company_name='" + company_name + '\'' +
                ", reg_nr=" + reg_nr +
                ", customers=" + customers +
                '}';
    }
}
