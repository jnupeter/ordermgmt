package au.com.ankys.controller;

import au.com.ankys.domain.Order;
import au.com.ankys.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by peter on 16-4-7.
 */
@Controller
@RequestMapping(value = "orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getAllOrders() {
        ModelAndView mv = new ModelAndView("orders/list");
        mv.addObject("orders", orderService.getAllOrders());
        return mv;
    }


    @RequestMapping(value = "{oid}", method = RequestMethod.GET)
    public ModelAndView getOrderDetail(@PathVariable Long oid) {
        ModelAndView mv = new ModelAndView("orders/detail");
        mv.addObject("order", orderService.getOrder(oid));
        return mv;
    }

    @RequestMapping(value = "new", method = RequestMethod.GET)
    public String getForm() {
        return "orders/form";
    }
}
