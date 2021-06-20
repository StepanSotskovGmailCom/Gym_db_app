package gymApplication.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "membership")

public class Membership {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer membership_id;

    @Column
    private String membership_type;

    @Column
    private Integer price ;

    @OneToMany (mappedBy = "membership_id")
    private final Set<Customer> customers = new HashSet<>();

    public Membership() {
    }


}

