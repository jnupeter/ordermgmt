package au.com.ankys.service;

import au.com.ankys.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by peter on 16-4-6.
 */
@Component
public class CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(final CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getById(Long cid) {
        return customerRepository.findOne(cid);
    }

    public void save(Customer customer) {
        customerRepository.save(customer);
    }
}
