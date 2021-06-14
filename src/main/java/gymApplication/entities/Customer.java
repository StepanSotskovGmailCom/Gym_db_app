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
    private Long customer_id;

    @Column
    private String customer_name;

    @Column
    private String customer_surname;

    @Column
    private Integer customer_card;

    @Column
    private Integer customer_age;

    @Column
    private String customer_sex;

    @Column
    private String customer_priority;

    @Column
    private String customer_company;

    @Column
    private Date start_date;

    @Column
    private Date exp_date;

    @Column
    private String membership;

    @Column
    private String activity_type;

    @Column
    private String extra;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_company")
    private Companies company;


    public Customer() {
    }

    public Customer(Long customer_id, String customer_name, String customer_surname, Integer customer_card, Integer customer_age, String customer_sex, String customer_priority, String customer_company, Date start_date, Date exp_date, String membership, String activity_type, String extra) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.customer_surname = customer_surname;
        this.customer_card = customer_card;
        this.customer_age = customer_age;
        this.customer_sex = customer_sex;
        this.customer_priority = customer_priority;
        this.customer_company = customer_company;
        this.start_date = start_date;
        this.exp_date = exp_date;
        this.membership = membership;
        this.activity_type = activity_type;
        this.extra = extra;
    }

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
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

    public Integer getCustomer_card() {
        return customer_card;
    }

    public void setCustomer_card(Integer customer_card) {
        this.customer_card = customer_card;
    }

    public Integer getCustomer_age() {
        return customer_age;
    }

    public void setCustomer_age(Integer customer_age) {
        this.customer_age = customer_age;
    }

    public String getCustomer_sex() {
        return customer_sex;
    }

    public void setCustomer_sex(String customer_sex) {
        this.customer_sex = customer_sex;
    }

    public String getCustomer_priority() {
        return customer_priority;
    }

    public void setCustomer_priority(String customer_priority) {
        this.customer_priority = customer_priority;
    }

    public String getCustomer_company() {
        return customer_company;
    }

    public void setCustomer_company(String customer_company) {
        this.customer_company = customer_company;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getExp_date() {
        return exp_date;
    }

    public void setExp_date(Date exp_date) {
        this.exp_date = exp_date;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    public String getActivity_type() {
        return activity_type;
    }

    public void setActivity_type(String activity_type) {
        this.activity_type = activity_type;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customer_id +
                ", customer_name='" + customer_name + '\'' +
                ", customer_surname='" + customer_surname + '\'' +
                ", customer_card=" + customer_card +
                ", customer_age=" + customer_age +
                ", customer_sex='" + customer_sex + '\'' +
                ", customer_priority='" + customer_priority + '\'' +
                ", customer_company='" + customer_company + '\'' +
                ", start_date=" + start_date +
                ", exp_date=" + exp_date +
                ", membership='" + membership + '\'' +
                ", activity_type='" + activity_type + '\'' +
                ", extra='" + extra + '\'' +
                '}';
    }
}
