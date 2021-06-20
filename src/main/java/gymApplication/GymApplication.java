package gymApplication;


import gymApplication.configuration.DataBaseSession;
import gymApplication.entities.Customer;
import gymApplication.repository.CustomerRepository;
import org.hibernate.Session;

import java.sql.Date;

import static javafx.application.Application.launch;


public class GymApplication  {

    public static void main(String[] args) {

        Session session = DataBaseSession.getInstance().openSession();
        session.beginTransaction();

        CustomerRepository customerRepository = new CustomerRepository();

        Customer customer = new Customer();

        customerRepository.save(customer);





        session.getTransaction().commit();
        DataBaseSession.shutdown();



    }


}
