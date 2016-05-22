package au.com.ankys.service;

import au.com.ankys.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by peter on 16-4-7.
 */
public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> getByCustomerId(Long cid);
}
