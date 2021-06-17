package gymApplication.entities;

import javax.persistence.*;

@Entity
@Table(name = "activity_type")

public class Activity_type {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private String activity_type;

    @Column
    private Integer trainer;

    @ManyToOne
    @JoinColumn (name="activity_type")
    private Customer customer;

    @ManyToOne
    @JoinColumn (name="trainer")
    private Employees employee;

    public Activity_type() {
    }


    public Activity_type(String activity_type, Integer trainer, Customer customer, Employees employee) {
        this.activity_type = activity_type;
        this.trainer = trainer;
        this.customer = customer;
        this.employee = employee;
    }

    public String getActivity_type() {
        return activity_type;
    }

    public void setActivity_type(String activity_type) {
        this.activity_type = activity_type;
    }

    public Integer getTrainer() {
        return trainer;
    }

    public void setTrainer(Integer trainer) {
        this.trainer = trainer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    public Employees getEmployee() {
        return employee;
    }

    public void setEmployee(Employees employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Activity_type{" +
                "activity_type='" + activity_type + '\'' +
                ", trainer=" + trainer +
                ", customer=" + customer +
                ", employee=" + employee +
                '}';
    }
}
