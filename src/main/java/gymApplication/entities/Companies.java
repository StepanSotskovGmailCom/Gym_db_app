package gymApplication.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Companies")

public class Companies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer company_id;

    @Column
    private String company_name;

    @Column
    private Integer reg_nr;


    @OneToMany (mappedBy = "customer_id")
    private final Set<Customer> customers = new HashSet<>();


    public Companies() {
    }

}
