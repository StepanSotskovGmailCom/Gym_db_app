package gymApplication.repository;

import gymApplication.entities.Customer;

import java.util.List;

public class CustomerRepository extends CrudRepository {

    private static final String HIBERNATE_SELECT_QUERY = "from Customer";

    private static final String ID_PARAM = "customer_id";
    private static final String DELETE_QUERY = "delete from Customer c where c.id = :" + ID_PARAM;



    public Customer findOne(Long id) {
        return super.findOne(id, Customer.class);
    }

    public List<Customer> findAll() {
        return super.findAll(HIBERNATE_SELECT_QUERY, Customer.class);
    }

}
