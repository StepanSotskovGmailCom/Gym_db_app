package gymApplication;


import gymApplication.configuration.DataBaseSession;
import gymApplication.entities.Companies;
import gymApplication.entities.Customer;
import gymApplication.entities.Membership;
import gymApplication.repository.CompaniesRepository;
import gymApplication.repository.CustomerRepository;
import gymApplication.repository.MembershipRepository;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.hibernate.Session;

import java.sql.Date;

import static javafx.application.Application.launch;


public class GymApplication  {

    public static void main(String[] args) {

        Session session = DataBaseSession.getInstance().openSession();

        session.beginTransaction();

        CustomerRepository customerRepository = new CustomerRepository();
        CompaniesRepository companiesRepository = new CompaniesRepository();
        MembershipRepository membershipRepository = new MembershipRepository();

        Companies company_ID1 = companiesRepository.findOne(1);
        Membership membership_ID1 = membershipRepository.findOne(1);


        Customer customer = new Customer("Renats","Maiznieks",company_ID1,membership_ID1);
        customerRepository.save(customer);



        session.getTransaction().commit();
        DataBaseSession.shutdown();
    }


}


//        CustomerRepository customerRepository = new CustomerRepository();
//
//
//        Companies companies = new Companies("Mutsubishi",64654);
//        Membership membership = new Membership("Month",24);
//        Customer customer = new Customer("Renats","Maiznieks",companies,membership);
//
//
//
//        companiesRepository.save(companies);
//        membershipRepository.save(membership);
//        customerRepository.save(customer);

//for(Membership membership : membershipRepository.findAll()){
//            System.out.println(membership);
//        }