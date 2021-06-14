package gymApplication.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Companies")

public class Companies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String company_name;

    @Column
    private Integer reg_nr;

    @OneToMany (mappedBy = "company_name")
    private final Set<Customer> customers = new HashSet<>();



}
