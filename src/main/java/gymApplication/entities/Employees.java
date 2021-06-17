package gymApplication.entities;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="employees")

public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employee_id;

    @Column
    private String employee_name;
    @Column
    private String employee_surname;
    @Column
    private String manager_type;

    @ManyToOne
    @JoinColumn (name="employee_id")
    private Customer customer;

    @OneToMany (mappedBy = "employee_id")
    private final Set<Activity_type> activity_types = new HashSet<>();

    public Employees() {
    }

    public Employees(Integer employee_id, String employee_name, String employee_surname, String manager_type, Customer customer) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_surname = employee_surname;
        this.manager_type = manager_type;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "employee_id=" + employee_id +
                ", employee_name='" + employee_name + '\'' +
                ", employee_surname='" + employee_surname + '\'' +
                ", manager_type='" + manager_type + '\'' +
                ", customer=" + customer +
                ", activity_types=" + activity_types +
                '}';
    }
}
