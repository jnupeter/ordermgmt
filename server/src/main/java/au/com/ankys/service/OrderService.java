package au.com.ankys.service;

import au.com.ankys.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by peter on 16-4-7.
 */
@Component
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;


    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public List<Order> getByCustomerId(Long cid) {
        return orderRepository.getByCustomerId(cid);
    }

    public Order getOrder(Long oid) {
        return orderRepository.findOne(oid);
    }
}
