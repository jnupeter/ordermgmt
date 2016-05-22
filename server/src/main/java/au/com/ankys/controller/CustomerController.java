package au.com.ankys.controller;

import au.com.ankys.domain.Customer;
import au.com.ankys.service.CustomerService;
import au.com.ankys.service.OrderService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by peter on 16-4-6.
 */
@Controller
@RequestMapping(value = "customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private OrderService orderService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getAllCustomers() {
        ModelAndView modelAndView = new ModelAndView("customers/list");
        modelAndView.addObject("customers", customerService.getAllCustomers());
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.GET, value="{cid}")
    public ModelAndView getCustomer(final @PathVariable Long cid) {
        ModelAndView mv = new ModelAndView("customers/detail");
        mv.addObject("customer", customerService.getById(cid));

        //get orders
        mv.addObject("orders", orderService.getByCustomerId(cid));
        return mv;
    }

    @RequestMapping(value = "/{cid}/orders")
    public String getOrdersByCustomer(final @PathVariable Long cid, final Model model) {
        model.addAttribute("orders", orderService.getByCustomerId(cid));
        return "orders/list";
    }

    @RequestMapping(method = RequestMethod.GET, params={"add"})
    public String createCustomerForm(final Model model) {
        model.addAttribute("c", new Customer());
        return "customers/form";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String createCustomer(@ModelAttribute("c") @Valid Customer customer, BindingResult bindingResult) {
        /*System.out.println("c.name " + customer.getName());
        System.out.println("c.address " + customer.getAddress());
        System.out.println("c.contactNumber" + customer.getContactNumber());*/
        if (bindingResult.hasErrors()) {
            System.out.println("============error=====");
        } else {
            System.out.println("================");
            customerService.save(customer);
        }
        return "redirect:/customers";
    }
}
