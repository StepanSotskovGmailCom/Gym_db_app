package gymApplication;


import gymApplication.configuration.DataBaseSession;
import gymApplication.entities.Customer;
import gymApplication.entities.Employees;
import gymApplication.entities.Extra;
import gymApplication.repository.CustomerRepository;
import org.hibernate.Session;

import java.sql.Date;
import java.util.TimeZone;

import static javafx.application.Application.launch;


public class GymApplication  {

    public static void main(String[] args) {

        Session session = DataBaseSession.getInstance().openSession();
        session.beginTransaction();

        CustomerRepository customerRepository = new CustomerRepository();

        Customer customer = new Customer(
                2L,"Joe","Johnson",
                2,36,"m","High",
                "intel",Date.valueOf("2 - 1 -2021"),Date.valueOf("3 - 1 -2021"),
                "Month","pilates","Sauna");
        customerRepository.save(customer);


        session.getTransaction().commit();
        DataBaseSession.shutdown();



    }


}
