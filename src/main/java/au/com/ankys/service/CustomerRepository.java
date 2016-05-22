package au.com.ankys.service;

import au.com.ankys.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by peter on 16-4-6.
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
