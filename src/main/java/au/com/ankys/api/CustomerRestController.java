package au.com.ankys.api;

import au.com.ankys.domain.Customer;
import au.com.ankys.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by peter on 16-4-6.
 */
@RestController
public class CustomerRestController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value="/api/customers", method= RequestMethod.GET)
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }
}
